package com.company.entity.cashiers;

import com.company.entity.Cashier;
import com.company.entity.CashierStrategy;
import com.company.entity.RuntimeExceptions.CashierDied;
import com.company.entity.strategies.DullStrategy;

public class LazyCashier extends Cashier {
    @Override
    public CashierStrategy strategy(Class customerClass) {
        return new DullStrategy();
    } // ленивый кассир всегда использует скучную стратегию
    @Override
    public void die() {
        died = true;
        if (died)
            throw new CashierDied("Cashier died!");
    }
}