package com.InterfacesAndLambdaExpressions.ex8;

public class Greeter implements Runnable{
   private int n;
   private String targer;

    public Greeter(int n, String targer) {
        this.n = n;
        this.targer = targer;
    }

    @Override
    public void run() {
        for(int i=0;i<n;i++){
            System.out.println("Hello "+targer);
        }
    }
}
