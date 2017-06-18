package com.company.entity;

public abstract class Cashier extends RandomizedHuman {
    public abstract CashierStrategy strategy(Class customerClass) // ленивый кассир всегда использует скучную стратегию
    ;
}