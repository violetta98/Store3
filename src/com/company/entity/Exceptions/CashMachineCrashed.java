package com.company.entity.Exceptions;

/**
 * Created by Violetta on 19-06-2017.
 */
public class CashMachineCrashed extends Exception {
    String message;
    public CashMachineCrashed (String s) { message = s;}
    public void sout() {
        System.out.println(message);
    }
}
