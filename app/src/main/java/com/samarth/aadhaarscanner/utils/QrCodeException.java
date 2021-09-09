package com.samarth.aadhaarscanner.utils;
/**
 * QrCodeException wraps all the exceptions which occurs while scanning and decoding secure Aadharcard
 * Qr Code
 */
public class QrCodeException extends Exception {

    public QrCodeException(String message) {
        super(message);
    }

    public QrCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public QrCodeException(Throwable cause) {
        super(cause);
    }
}
