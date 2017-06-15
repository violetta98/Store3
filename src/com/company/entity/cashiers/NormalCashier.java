package com.company.entity.cashiers;

import com.company.entity.Cashier;
import com.company.entity.CashierStrategy;
import com.company.entity.customers.NormalCustomer;
import com.company.entity.strategies.DullStrategy;
import com.company.entity.strategies.FriendlyStrategy;

public class NormalCashier implements Cashier {
    @Override
    public CashierStrategy strategy(Class customerClass) {
        if (NormalCustomer.class.isAssignableFrom((customerClass)))
            return new FriendlyStrategy(); // если к кассиру приходит нормальный покупатель, то он использует дружественную стратегию
        else
            return new DullStrategy(); // в остальных случаях скучную стратегию
    }
}