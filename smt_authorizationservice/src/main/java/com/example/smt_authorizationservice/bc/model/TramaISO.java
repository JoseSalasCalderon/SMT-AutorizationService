package com.example.smt_authorizationservice.bc.model;

public class TramaISO {
    private String mti;
    private String primaryBitmap;
    private String cardNumber;
    private String processingCode;
    private String transactionAmount;
    private String transmissionDateTime;
    private String systemTraceNumber;
    private String localTransactionTime;
    private String expirationDate;
    private String retrievalReferenceNumber;
    private String authorizationIdentifier;
    private String merchantIdentifier;

    // Getters y setters

    public String getMti() {
        return mti;
    }

    public void setMti(String mti) {
        this.mti = mti;
    }

    public String getPrimaryBitmap() {
        return primaryBitmap;
    }

    public void setPrimaryBitmap(String primaryBitmap) {
        this.primaryBitmap = primaryBitmap;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getProcessingCode() {
        return processingCode;
    }

    public void setProcessingCode(String processingCode) {
        this.processingCode = processingCode;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransmissionDateTime() {
        return transmissionDateTime;
    }

    public void setTransmissionDateTime(String transmissionDateTime) {
        this.transmissionDateTime = transmissionDateTime;
    }

    public String getSystemTraceNumber() {
        return systemTraceNumber;
    }

    public void setSystemTraceNumber(String systemTraceNumber) {
        this.systemTraceNumber = systemTraceNumber;
    }

    public String getLocalTransactionTime() {
        return localTransactionTime;
    }

    public void setLocalTransactionTime(String localTransactionTime) {
        this.localTransactionTime = localTransactionTime;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
        this.retrievalReferenceNumber = retrievalReferenceNumber;
    }

    public String getAuthorizationIdentifier() {
        return authorizationIdentifier;
    }

    public void setAuthorizationIdentifier(String authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
    }

    public String getMerchantIdentifier() {
        return merchantIdentifier;
    }

    public void setMerchantIdentifier(String merchantIdentifier) {
        this.merchantIdentifier = merchantIdentifier;
    }

    @Override
    public String toString() {
        return "ISO8583Message{" +
                "mti='" + mti + '\'' +
                ", primaryBitmap='" + primaryBitmap + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", processingCode='" + processingCode + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                ", transmissionDateTime='" + transmissionDateTime + '\'' +
                ", systemTraceNumber='" + systemTraceNumber + '\'' +
                ", localTransactionTime='" + localTransactionTime + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", retrievalReferenceNumber='" + retrievalReferenceNumber + '\'' +
                ", authorizationIdentifier='" + authorizationIdentifier + '\'' +
                ", merchantIdentifier='" + merchantIdentifier + '\'' +
                '}';
    }
}
