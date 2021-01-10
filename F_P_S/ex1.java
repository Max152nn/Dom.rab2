package com.F_P_S;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        method(20);
    }

    public static void method(int a){
        String convert = Integer.toBinaryString(a);
        System.out.println(convert);
        convert = Integer.toOctalString(a);
        System.out.println(convert);
        convert = Integer.toHexString(a);
        System.out.println(convert);
        double plav = a;
        while(!((int)(plav=plav/10)==0)){
        }
        convert = Double.toHexString(plav);
        System.out.println(convert);
    }
}
