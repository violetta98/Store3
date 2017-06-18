package com.company.entity;

import com.company.entity.CashMachine.RandomizedCashMachine;
import com.company.entity.Exceptions.CashMachineCrashed;
import com.company.entity.Exceptions.PaperRanOut;
import com.company.entity.cashiers.Errors.CashierDied;

import java.util.LinkedList;
import java.util.Queue;

public class Register implements Runnable {
    private final Cashier cashier;
    private final Queue<Customer> queue = new LinkedList<>();
    private RandomizedCashMachine rcm = new RandomizedCashMachine();
    public Register(Cashier cashier) {
        this.cashier=cashier;
    }
    public void newCustomer(Customer customer) {
        queue.add(customer);
    }
    public void run() {
        int numberOfCustomers=0;
        int cashMashineCrash=0;
        int paperRO=0;
        int totalTime=0;
        Customer customer;
        while((customer=queue.poll())!=null) { // ctrl + q
            try {
                rcm.crash();
                rcm.paperRanOut();
                cashier.die();
                CashierStrategy strategy = cashier.strategy(customer.getClass()); // кассир выбирает стратегию, в зависимости от того, какой покупатель стоит перед ним
                totalTime += strategy.communicate(customer); // и применяет эту стратегию, то есть общается с покупателем
            }
            catch (CashMachineCrashed ex) {
                ex.sout();
                cashMashineCrash++;
            }
            catch (PaperRanOut ex) {
                ex.sout();
                paperRO++;
            }
            catch(CashierDied er) {
                er.sout();
                break;
            }
            finally {
                numberOfCustomers++;
            }
        }
        System.out.println("There was "+ numberOfCustomers + " customers and it took "+totalTime + " seconds.");
        System.out.println("Cash Machine was broken " + cashMashineCrash + " times.");
        System.out.println("Paper ran out " + paperRO + " times.");
    }
}
