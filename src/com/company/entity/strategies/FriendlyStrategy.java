package com.company.entity.strategies;

import com.company.entity.CashMachine.RandomizedCashMachine;
import com.company.entity.CashierStrategy;
import com.company.entity.Customer;
import com.company.entity.Exceptions.CashMachineCrashed;
import com.company.entity.Exceptions.PaperRanOut;

public class FriendlyStrategy extends CashierStrategy{
    public static final int FRIENDLY_COEFFICIENT=-2;
    @Override
    public int communicate(Customer customer, RandomizedCashMachine rcm) throws CashMachineCrashed, PaperRanOut {
        System.out.println("It's a friendly strategy ^_^");
        return customer.buyThings() + rcm.beepThings() + rcm.printCheque() + FRIENDLY_COEFFICIENT;
    }
}