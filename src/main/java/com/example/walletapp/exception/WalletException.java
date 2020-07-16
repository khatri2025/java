package com.example.walletapp.exception;

import com.example.walletapp.model.Wallet;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WalletException extends RuntimeException {
    public WalletException(String message){
        super(message);
    }
}
