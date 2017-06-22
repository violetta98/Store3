package com.company;

//import com.company.entity.cashiers.RandomizedCashier;
import com.company.entity.Cashier;
import com.company.entity.Customer;
import com.company.entity.cashiers.LazyCashier;
import com.company.entity.cashiers.NormalCashier;
import com.company.entity.customers.RandomizedAgressiveCustomer;
import com.company.entity.customers.RandomizedLazyCustomer;
import com.company.entity.customers.RandomizedNormalCustomer;
import com.company.entity.Register;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main m = new Main();
        for (int i=0; i<new Random().nextInt(500); i++) {
            new Thread(m.newRegister()).start(); // все кассы работают в разных потоках
            Thread.currentThread().sleep(new Random().nextInt(123)); // заставим потоки ждать
        }
        int number = new Random().nextInt(20);
        ExecutorService pool = Executors.newFixedThreadPool(number);
        for (int i = 0; i < number; i++) {
            pool.submit(m.newRegister());
        }
        pool.shutdown();
        System.out.println("All registers have done their work.");
    }

    private Cashier randomCashier() {
       if (new Random().nextBoolean())
           return new LazyCashier(); // садим в кассу ленивого кассира
       else
           return new NormalCashier(); // садим в кассу нормального кассира
    }

    private Customer randomCustomer() {
        int q=new Random().nextInt(3);
        if (q==0)
            return new RandomizedNormalCustomer(); // добавляем нормального покупателя в очередь
        else if (q==1)
            return new RandomizedLazyCustomer();  // добавляем ленивого покупателя в очередь
        else
            return new RandomizedAgressiveCustomer();
    }

    private Register newRegister() {
        Register register = new Register(randomCashier()); // садим в кассу рандомного кассира
        for (int i=0; i<new Random().nextInt(15); i++)
            register.newCustomer(randomCustomer()); // добавляет в очередь рандомного покупателя
        return register;
    }
}
