package com.example.smt_authorizationservice.bc.businessRules;

import java.nio.charset.StandardCharsets;

import com.example.smt_authorizationservice.bc.model.TramaISO;
import com.example.smt_authorizationservice.bc.utilities.Mapper;

public class BusinessRules {

    public static boolean TramaISOIsValid (byte[] entity) {
        String isoMessage = new String(entity, StandardCharsets.UTF_8).trim();
        
        if (isoMessage.length() == 106) {

            TramaISO tramaIso = Mapper.bytesToTramaISO(entity);
            
            if (tramaIso.getMti().length() != 4) {
                return false;
            }
    
            if (tramaIso.getPrimaryBitmap().length() != 16) {
                return false;
            }
    
            if (tramaIso.getCardNumber().length() != 16) {
                return false;
            }
    
            if (tramaIso.getProcessingCode().length() != 6) {
                return false;
            }
    
            if (tramaIso.getTransactionAmount().length() != 12) {
                return false;
            }
    
            if (tramaIso.getTransmissionDateTime().length() != 10) {
                return false;
            }
    
            if (tramaIso.getSystemTraceNumber().length() != 6) {
                return false;
            }
    
            if (tramaIso.getLocalTransactionTime().length() != 6) {
                return false;
            }
    
            if (tramaIso.getExpirationDate().length() != 4) {
                return false;
            }
    
            if (tramaIso.getRetrievalReferenceNumber().length() != 12) {
                return false;
            }
    
            if (tramaIso.getAuthorizationIdentifier().length() != 6) {
                return false;
            }
    
            if (tramaIso.getMerchantIdentifier().length() != 8) {
                return false;
            }
            return true;
        }
        
        return false;
        
    }
}
