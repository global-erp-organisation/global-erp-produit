package com.camlait.global.erp.produit.exception;

@SuppressWarnings("serial")
public class GlobalProduitException extends RuntimeException {
    
    public GlobalProduitException(String message) {
        super(message);
    }
    
    public GlobalProduitException(String message, Throwable cause) {
        super(message,cause);
    }
}
