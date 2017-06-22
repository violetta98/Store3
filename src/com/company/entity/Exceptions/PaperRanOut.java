package com.company.entity.Exceptions;

/**
 * Created by Violetta on 19-06-2017.
 */
public class PaperRanOut extends Exception {
    public static String DEFAULT_MESSAGE = "Opps... Paper ran out :(";
    public PaperRanOut() {
        super(DEFAULT_MESSAGE);
    }
    public PaperRanOut (String message) {
        super(message);
    }
}
