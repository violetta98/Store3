package com.company.entity.CashMachine;

import com.company.entity.Exceptions.CashMachineCrashed;
import com.company.entity.Exceptions.PaperRanOut;

import java.util.Random;

/**
 * Created by Violetta on 19-06-2017.
 */
public class RandomizedCashMachine {
    boolean crashing;
    boolean varPaperRanOut;
    Random rand = new Random();
    public void crash() throws CashMachineCrashed {
        crashing = (new Random()).nextBoolean();
        if (crashing)
            throw new CashMachineCrashed("Opps... Cash Machine was broken... Repairmen have already left for us.");
    }
    public void paperRanOut() throws PaperRanOut {
        varPaperRanOut = (new Random()).nextBoolean();
        if (varPaperRanOut)
            throw new PaperRanOut("Opps... Paper ran out :(");
    }
}
