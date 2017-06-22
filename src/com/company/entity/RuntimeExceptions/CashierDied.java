package com.company.entity.RuntimeExceptions;

/**
 * Created by Violetta on 19-06-2017.
 */
public class CashierDied extends RuntimeException {
    public static String DEFAULT_MESSAGE = "Cashier died!";
    public CashierDied() {
        super(DEFAULT_MESSAGE);
    }
    public CashierDied (String message) {
        super(message);
    }
}
