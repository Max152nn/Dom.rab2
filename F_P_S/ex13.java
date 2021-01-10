package com.F_P_S;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ex13 {
    public static Random random =  new Random();
    static int diapason = 49 + Math.abs(1) + 1;
    public static void main(String[] args) {
        int[] mas = new int[6];
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=49;i++){
            list.add(i);
        }
        for(int i = 0;i<6;i++){
            int index = (int)(Math.random()* diapason);
            mas[i] = list.get(index);
            list.remove(index);
        }
        System.out.println(Arrays.toString(mas));
    }
}
