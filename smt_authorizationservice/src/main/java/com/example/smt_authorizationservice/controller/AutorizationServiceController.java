package com.example.smt_authorizationservice.controller;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.smt_authorizationservice.bw.interfaces.BW.IAuthorizationServiceBW;

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

}
