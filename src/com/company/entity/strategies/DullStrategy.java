package com.company.entity.strategies;

import com.company.entity.CashMachine.RandomizedCashMachine;
import com.company.entity.CashierStrategy;
import com.company.entity.Customer;
import com.company.entity.Exceptions.CashMachineCrashed;
import com.company.entity.Exceptions.PaperRanOut;

public class DullStrategy extends CashierStrategy {
    public static final int DULL_COEFFICIENT=3;
    @Override
    public int communicate(Customer customer, RandomizedCashMachine rcm) throws PaperRanOut, CashMachineCrashed {
        System.out.println("It's a dull strategy :(");
        return customer.buyThings() + rcm.beepThings() + rcm.printCheque() + DULL_COEFFICIENT;
    }
}
