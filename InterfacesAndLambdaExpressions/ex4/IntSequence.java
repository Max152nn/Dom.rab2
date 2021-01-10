package com.InterfacesAndLambdaExpressions.ex4;

public interface IntSequence {
    boolean hasNext();
    int next();
    static IntSequence digitsOf(int n) {
        return new DigitSequence(n);
    }
    //Exercises 4
    static void of(int... a) {
        for(int chislo:a) {
                System.out.println(chislo);
        }
    }

    //Exercises 5
    static void constant(int i){
        while (true){
            System.out.println(i);
        }
    }
}
