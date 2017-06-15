package com.company.entity.strategies;

import com.company.entity.CashierStrategy;
import com.company.entity.Customer;

public class DullStrategy implements CashierStrategy {
    public static final int DULL_COEFFICIENT=3;
    @Override
    public int communicate(Customer customer) {
        System.out.println("It's a dull strategy :(");
        return customer.buyThings()+DULL_COEFFICIENT;
    }
}
