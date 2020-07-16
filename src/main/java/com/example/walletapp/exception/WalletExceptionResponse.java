package com.example.walletapp.exception;

public class WalletExceptionResponse {
    private String id;

    public WalletExceptionResponse(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WalletExceptionResponse() {
    }
}
