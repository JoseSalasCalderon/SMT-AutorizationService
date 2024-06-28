package com.example.smt_authorizationservice.bc.utilities;

import java.nio.charset.StandardCharsets;

import com.example.smt_authorizationservice.bc.model.TramaISO;
import com.example.smt_authorizationservice.bc.model.Transaction;

public class Mapper {
    
    public static TramaISO bytesToTramaISO(byte[] entity) {

        String isoMessage = new String(entity, StandardCharsets.UTF_8).trim();
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

    public static byte[] tramaISOToBytes(TramaISO tramaISO) {
        StringBuilder sb = new StringBuilder();

        sb.append(tramaISO.getMti());
        sb.append(tramaISO.getPrimaryBitmap());
        sb.append(tramaISO.getCardNumber());
        sb.append(tramaISO.getProcessingCode());
        sb.append(tramaISO.getTransactionAmount());
        sb.append(tramaISO.getTransmissionDateTime());
        sb.append(tramaISO.getSystemTraceNumber());
        sb.append(tramaISO.getLocalTransactionTime());
        sb.append(tramaISO.getExpirationDate());
        sb.append(tramaISO.getRetrievalReferenceNumber());
        sb.append(tramaISO.getAuthorizationIdentifier());
        sb.append(tramaISO.getMerchantIdentifier());

        return sb.toString().getBytes(StandardCharsets.UTF_8);
    }

    public static Transaction tramaISOToTransaction(TramaISO tramaISO) {
        double montoEnCentavos = Double.parseDouble(tramaISO.getTransactionAmount());
        double montoEnDolares = montoEnCentavos / 100.0;

        String cardNumber = tramaISO.getCardNumber();
        String bin = cardNumber.substring(0, 6);
        String[] bankAndBrand = BinMapper.obtenerBancoYMarca(bin);
        String banco = (bankAndBrand != null) ? bankAndBrand[0] : "Banco desconocido";
        String marcaTarjeta = (bankAndBrand != null) ? bankAndBrand[1] : "Marca desconocida";

        return new Transaction(cardNumber, montoEnCentavos, tramaISO.getSystemTraceNumber(),
                tramaISO.getAuthorizationIdentifier(), tramaISO.getRetrievalReferenceNumber(), "Enviado", banco, marcaTarjeta);
    }
    
}
