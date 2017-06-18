package com.company.entity;

import com.company.entity.cashiers.Errors.CashierDied;

import java.util.Random;

public class RandomizedHuman {
    protected boolean died;
    protected final Random random=new Random();
    protected int randomAction() {
        return random.nextInt(15);
    }
    public void die() throws CashierDied {
        died = new Random().nextBoolean();
        if (died)
            throw new CashierDied("Cashier died!");
    }
}
