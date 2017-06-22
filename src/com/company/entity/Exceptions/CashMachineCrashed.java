package com.company.entity.Exceptions;

/**
 * Created by Violetta on 19-06-2017.
 */
public class CashMachineCrashed extends Exception {
    public static String DEFAULT_MESSAGE = "Opps... Cash Machine was broken... Repairmen have already left for us.";
    public CashMachineCrashed() {
        super(DEFAULT_MESSAGE);
    }
    public CashMachineCrashed (String message) {
        super(message);
    }
}
