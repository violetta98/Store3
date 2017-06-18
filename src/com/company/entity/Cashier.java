package com.company.entity;

import com.company.entity.Errors.CashierDied;

import java.util.Random;

public abstract class Cashier extends RandomizedHuman {
    public abstract CashierStrategy strategy(Class customerClass) // ленивый кассир всегда использует скучную стратегию
    ;
    public void die() throws CashierDied {
        died = new Random().nextBoolean();
        if (died)
            throw new CashierDied("Cashier died!");
    }
}