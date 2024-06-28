package com.example.smt_authorizationservice.controller;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.smt_authorizationservice.bc.model.TramaISO;
import com.example.smt_authorizationservice.bc.model.Transaction;
import com.example.smt_authorizationservice.bc.utilities.BinMapper;
import com.example.smt_authorizationservice.bw.interfaces.BW.IAuthorizationServiceBW;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class AutorizationServiceController {

    private IAuthorizationServiceBW authorizationBW;
    // QUitar la URL
    private String url = "http://localhost:8083/authorizationAPIGW2";

    @Autowired
    public AutorizationServiceController(IAuthorizationServiceBW authorizationBW) {
        this.authorizationBW = authorizationBW;
    }

    @GetMapping("/example1")
    public boolean getMethodName() {
        return true;
    }

    @PostMapping("/authorization")
    public ResponseEntity<byte[]> authorization(@RequestBody byte[] entity) {
        byte[] response = this.authorizationBW.authorization(entity);
        if (response != null) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(entity);
    }

    @PostMapping("/transaction")
    public Transaction makeTransaction(@RequestBody byte[] entity) {
        String isoMessage = new String(entity, StandardCharsets.UTF_8).trim();
        TramaISO message = parseTramaISO(isoMessage);
        
        Transaction transaction = this.createTransaction(message);
        RestTemplate restTemplate = new RestTemplate();
        Transaction response = restTemplate.postForObject(this.url, transaction, Transaction.class);
        System.out.println("Hola");
        System.out.println(response.toString());
        return response;
    }
    

    private TramaISO parseTramaISO(String isoMessage) {
        TramaISO message = new TramaISO();

        message.setMti(isoMessage.substring(0, 4));
        message.setPrimaryBitmap(isoMessage.substring(4, 20));
        message.setCardNumber(isoMessage.substring(20, 36));
        message.setProcessingCode(isoMessage.substring(36, 42));
        message.setTransactionAmount(isoMessage.substring(42, 54));
        message.setTransmissionDateTime(isoMessage.substring(54, 64));
        message.setSystemTraceNumber(isoMessage.substring(64, 70));
        message.setLocalTransactionTime(isoMessage.substring(70, 76));
        message.setExpirationDate(isoMessage.substring(76, 80));
        message.setRetrievalReferenceNumber(isoMessage.substring(80, 92));
        message.setAuthorizationIdentifier(isoMessage.substring(92, 98));
        message.setMerchantIdentifier(isoMessage.substring(98, 106));
        return message;
    }

    private Transaction createTransaction(TramaISO tramaISO){
        double montoEnCentavos = Double.parseDouble(tramaISO.getTransactionAmount());
        double montoEnDolares = montoEnCentavos / 100.0;

        String cardNumber = tramaISO.getCardNumber();
        String bin = cardNumber.substring(0, 6);
        String[] bankAndBrand = BinMapper.obtenerBancoYMarca(bin);
        String banco = (bankAndBrand != null) ? bankAndBrand[0] : "Banco desconocido";
        String marcaTarjeta = (bankAndBrand != null) ? bankAndBrand[1] : "Marca desconocida";

        return new Transaction(cardNumber, montoEnDolares, tramaISO.getSystemTraceNumber(),
                tramaISO.getAuthorizationIdentifier(), tramaISO.getRetrievalReferenceNumber(), "Enviado", banco, marcaTarjeta);
    }
}
