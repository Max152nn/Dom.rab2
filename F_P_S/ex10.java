package com.F_P_S;

import java.util.Random;

public class ex10 {
    public final static Random random = new Random();

    public static void main(String[] args) {
        char c = (char)(random.nextInt(26) + 'a');
        String stroka = Long.toString(ran(),36)+c;
        System.out.println(stroka);
    }

    public static long ran(){
        return random.nextLong();
    }
}
