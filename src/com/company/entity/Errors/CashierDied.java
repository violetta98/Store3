package com.company.entity.Errors;

/**
 * Created by Violetta on 19-06-2017.
 */
public class CashierDied extends Error {
    String message;
    public CashierDied (String s) { message = s;}
    public void sout() {
        System.out.println(message);
    }
}
