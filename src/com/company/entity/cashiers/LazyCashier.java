package com.company.entity.cashiers;

import com.company.entity.Cashier;
import com.company.entity.CashierStrategy;
import com.company.entity.Customer;
import com.company.entity.strategies.DullStrategy;

import java.util.Random;

public class LazyCashier implements Cashier {

    @Override
    public CashierStrategy strategy(Class customerClass) {
        return new DullStrategy();
    } // ленивый кассир всегда использует скучную стратегию
}