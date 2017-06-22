package com.company.entity;

import com.company.entity.RuntimeExceptions.CashierDied;

import java.util.Random;

public abstract class Cashier extends RandomizedHuman {
    public abstract CashierStrategy strategy(Class customerClass);
    public void die() throws CashierDied {
        died = new Random().nextBoolean();
        if (died)
            throw new CashierDied();
    }
}
