package com.example.smt_authorizationservice.sg.actions;

import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.smt_authorizationservice.bc.model.TramaISO;
import com.example.smt_authorizationservice.bc.model.Transaction;
import com.example.smt_authorizationservice.bc.utilities.Mapper;
import com.example.smt_authorizationservice.bw.interfaces.SG.IAuthorizationServiceSG;


@Component
public class AuthorizationServiceSG implements IAuthorizationServiceSG{

    //private String urlLocal = "http://localhost:8083/authorizationAPIGW2";
    private String url = "https://smt-apigateway-2.onrender.com/authorizationAPIGW2";

    @Override
    public byte[] authorization(byte[] entity) {
        
        TramaISO tramaIso = Mapper.bytesToTramaISO(entity);
        
        //Acá debo parsear y enviar al apigateway que conecta con el emisor

        Transaction transaction = Mapper.tramaISOToTransaction(tramaIso);
        RestTemplate restTemplate = new RestTemplate();
        Transaction response = restTemplate.postForObject(this.url, transaction, Transaction.class);

        tramaIso.setMti("0210");
        // Validar respuesta 
        
        if ("Declinado".equals(response.getEstado())) {
            tramaIso.setProcessingCode("000051");
        }

        // Luego borrar este IF
        
        if (tramaIso != null) {
            System.out.println("MTI: " + tramaIso.getMti());
            System.out.println("Primary Bitmap: " + tramaIso.getPrimaryBitmap());
            System.out.println("Card Number: " + tramaIso.getCardNumber());
            System.out.println("Processing Code: " + tramaIso.getProcessingCode());
            System.out.println("Transaction Amount: " + tramaIso.getTransactionAmount());
            System.out.println("Transmission DateTime: " + tramaIso.getTransmissionDateTime());
            System.out.println("System Trace Number: " + tramaIso.getSystemTraceNumber());
            System.out.println("Local Transaction Time: " + tramaIso.getLocalTransactionTime());
            System.out.println("Expiration Date: " + tramaIso.getExpirationDate());
            System.out.println("Retrieval Reference Number: " + tramaIso.getRetrievalReferenceNumber());
            System.out.println("Authorization Identifier: " + tramaIso.getAuthorizationIdentifier());
            System.out.println("Merchant Identifier: " + tramaIso.getMerchantIdentifier());
            return Mapper.tramaISOToBytes(tramaIso);
        }
        return null;
    }
    
}
