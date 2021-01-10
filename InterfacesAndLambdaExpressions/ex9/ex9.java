package com.InterfacesAndLambdaExpressions.ex9;

import com.InterfacesAndLambdaExpressions.ex8.Greeter;

public class ex9 {
    public static void main(String[] args) {
        Greeter greeter = new Greeter(3,"targer");
        Greeter greeter1 = new Greeter(5,"TArger");
        Thread thread2 = new Thread(greeter1);
        greeter.run();
        System.out.println("----");
        thread2.start();
    }
}
