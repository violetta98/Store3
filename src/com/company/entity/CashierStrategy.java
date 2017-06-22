package com.company.entity;

import com.company.entity.CashMachine.RandomizedCashMachine;
import com.company.entity.Exceptions.CashMachineCrashed;
import com.company.entity.Exceptions.PaperRanOut;

public abstract class CashierStrategy {
    public abstract int communicate(Customer customer, RandomizedCashMachine rcm) throws CashMachineCrashed, PaperRanOut;
}
