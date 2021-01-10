package com.F_P_S;

import java.math.BigInteger;

public class ex6 {
    public static void main(String[] args) {
        System.out.println(factorial(100));
    }

    public static BigInteger factorial(int n)
    {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
