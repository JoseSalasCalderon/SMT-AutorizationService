package com.example.smt_authorizationservice.bc.model;

public class Transaction {
    private String pan;
    private double monto;
    private String numeroSecuencia;
    private String identificadorAutorizacion;
    private String referenciaSeguimiento;
    private String tipoTransferencia;
    private String estado;
    private String banco;
    private String marcaTarjeta;

    public Transaction(String pan, double monto, String numeroSecuencia, String identificadorAutorizacion,
            String referenciaSeguimiento, String tipoTransferencia, String estado, String banco, String marcaTarjeta) {
        this.pan = pan;
        this.monto = monto;
        this.numeroSecuencia = numeroSecuencia;
        this.identificadorAutorizacion = identificadorAutorizacion;
        this.referenciaSeguimiento = referenciaSeguimiento;
        this.tipoTransferencia = tipoTransferencia;
        this.estado = estado;
        this.banco = banco;
        this.marcaTarjeta = marcaTarjeta;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNumeroSecuencia() {
        return numeroSecuencia;
    }

    public void setNumeroSecuencia(String numeroSecuencia) {
        this.numeroSecuencia = numeroSecuencia;
    }

    public String getIdentificadorAutorizacion() {
        return identificadorAutorizacion;
    }

    public void setIdentificadorAutorizacion(String identificadorAutorizacion) {
        this.identificadorAutorizacion = identificadorAutorizacion;
    }

    public String getReferenciaSeguimiento() {
        return referenciaSeguimiento;
    }
    
    public void setReferenciaSeguimiento(String referenciaSeguimiento) {
        this.referenciaSeguimiento = referenciaSeguimiento;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getMarcaTarjeta() {
        return marcaTarjeta;
    }

    public void setMarcaTarjeta(String marcaTarjeta) {
        this.marcaTarjeta = marcaTarjeta;
    }

    @Override
    public String toString() {
        return "Transaction [pan=" + pan + ", monto=" + monto + ", numeroSecuencia=" + numeroSecuencia
                + ", identificadorAutorizacion=" + identificadorAutorizacion + ", referenciaSeguimiento="
                + referenciaSeguimiento + ", tipoTransferencia=" + tipoTransferencia + ", estado=" + estado + ", banco="
                + banco + ", marcaTarjeta=" + marcaTarjeta + "]";
    }

    
}
