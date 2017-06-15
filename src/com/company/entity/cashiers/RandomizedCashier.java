package com.company.entity.cashiers;

import com.company.entity.Cashier;
import com.company.entity.CashierStrategy;
import com.company.entity.RandomizedHuman;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Hillel6 on 08.06.2017.
 */
public class RandomizedCashier extends RandomizedHuman implements Cashier {

    @Override
    public CashierStrategy strategy(Class customerClass) {
        return null;
    }
}