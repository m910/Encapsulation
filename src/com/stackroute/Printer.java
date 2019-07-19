package com.stackroute;

import java.util.*;


public class Printer {


    private double tonerLevel;
    private int noOfPagesPrinted;
    private boolean duplexPrinter;

    public double getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public void setNoOfPagesPrinted(int noOfPagesPrinted) {
        this.noOfPagesPrinted = noOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }

    public void getTonerLeveltonerLevel(double tonerLevel) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

    }


    public void getNumberOfPages() {
        int  n=0, m=10;
        for(int i=0;i<m;i++) {

            if (duplexPrinter == true){
                ++n;
            }


            System.out.println(n);
        }

            }


        }



