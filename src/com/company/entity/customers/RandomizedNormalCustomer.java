package com.company.entity.customers;

import com.company.entity.RandomizedHuman;

public class RandomizedNormalCustomer extends RandomizedHuman implements NormalCustomer { // покупатель помечен интерфейсом Нормальный Покупатель

    @Override
    public int buyThings() {
        return randomAction();
    }
}