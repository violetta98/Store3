package com.company.entity.strategies;

import com.company.entity.CashierStrategy;
import com.company.entity.Customer;

public class FriendlyStrategy implements CashierStrategy{
    public static final int FRIENDLY_COEFFICIENT=-2;
    @Override
    public int communicate(Customer customer) {
        System.out.println("It's a friendly strategy ^_^");
        return customer.buyThings()+FRIENDLY_COEFFICIENT;
    }
}