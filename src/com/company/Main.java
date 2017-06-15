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

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Register register = new Register(m.randomCashier()); // садим в кассу рандомного кассира
        for (int i=0; i<new Random().nextInt(15); i++)
            register.newCustomer(m.randomCustomer()); // добавляет в очередь рандомного покупателя
        register.run();
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
}
