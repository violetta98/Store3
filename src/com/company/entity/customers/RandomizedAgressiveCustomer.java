package com.company.entity.customers;

import com.company.entity.RandomizedHuman;

public class RandomizedAgressiveCustomer extends RandomizedHuman implements AgressiveCustomer { // покупатель помечен интерфейсом Агрессивный Покупатель

    @Override
    public int buyThings() {
        return randomAction();
    }
}