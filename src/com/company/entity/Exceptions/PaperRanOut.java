package com.company.entity.Exceptions;

/**
 * Created by Violetta on 19-06-2017.
 */
public class PaperRanOut extends Exception {
    String message;
    public PaperRanOut (String s) { message = s;}
    public void sout() {
        System.out.println(message);
    }
}
