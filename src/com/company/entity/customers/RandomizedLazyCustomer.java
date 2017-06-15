package com.company.entity.customers;

import com.company.entity.RandomizedHuman;

public class RandomizedLazyCustomer extends RandomizedHuman implements LazyCustomer { // покупатель помечен интерфейсом Ленивый Покупатель

    @Override
    public int buyThings() {
        return randomAction();
    }
}