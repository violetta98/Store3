package com.company.entity;

import java.util.LinkedList;
import java.util.Queue;

public class Register implements Runnable {
    private final Cashier cashier;
    private final Queue<Customer> queue = new LinkedList<>();
    public Register(Cashier cashier) {
        this.cashier=cashier;
    }
    public void newCustomer(Customer customer) {
        queue.add(customer);
    }
    public void run() {
        int numberOfCustomers=0;
        int totalTime=0;
        Customer customer;
        while((customer=queue.poll())!=null) { // ctrl + q
            CashierStrategy strategy = cashier.strategy(customer.getClass()); // кассир выбирает стратегию, в зависимости от того, какой покупатель стоит перед ним
            totalTime+=strategy.communicate(customer); // и применяет єту стратегию, то есть общается с покупателем
            numberOfCustomers++;
        }
        System.out.println("There was "+ numberOfCustomers + " customers and it took "+totalTime + " seconds.");
    }
}
