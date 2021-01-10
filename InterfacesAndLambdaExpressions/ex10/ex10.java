package com.InterfacesAndLambdaExpressions.ex10;

import com.InterfacesAndLambdaExpressions.ex8.Greeter;

import java.util.ArrayList;

public class ex10 {
    public static void main(String[] args) {
        Greeter greeter = new Greeter(1,"TPA");
        Greeter greeter2 = new Greeter(1,"TPB");
        Greeter greeter3 = new Greeter(1,"TPV");
        runlnOrder(greeter,greeter2,greeter3);
        System.out.println("-----------");
        runTogether(greeter,greeter2,greeter3);

    }

    public static void runTogether(Runnable...tasks){
        for (int i=0;i<tasks.length;i++){
            Thread nit = new Thread(tasks[i]);
            System.out.println(nit.getName());
            nit.start();
        }
        System.out.println("runTogether");
    }

    public static void runlnOrder(Runnable... tasks){
        System.out.println("runlnOrder");
        for (int i=0;i<tasks.length;i++){
            tasks[i].run();
        }
    }
}
