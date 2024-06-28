package com.example.smt_authorizationservice.bw.cu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.smt_authorizationservice.bc.businessRules.BusinessRules;
import com.example.smt_authorizationservice.bw.interfaces.BW.IAuthorizationServiceBW;
import com.example.smt_authorizationservice.bw.interfaces.SG.IAuthorizationServiceSG;


@Component
public class AuthorizationServiceBW implements IAuthorizationServiceBW{

    IAuthorizationServiceSG authorizationSG;

    @Autowired
    public AuthorizationServiceBW(IAuthorizationServiceSG authorizationSG) {
        this.authorizationSG = authorizationSG;
    }

    @Override
    public byte[] authorization(byte[] entity) {
        if (BusinessRules.TramaISOIsValid(entity)) {
            System.out.println("Valido");
            return this.authorizationSG.authorization(entity);
        }
        System.out.println("Invalido");
        return null;
    }
    
}
