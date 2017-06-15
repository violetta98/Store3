package com.company.entity;

public interface Cashier {
    CashierStrategy strategy(Class customerClass);
}