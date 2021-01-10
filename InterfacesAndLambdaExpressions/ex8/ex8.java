package com.InterfacesAndLambdaExpressions.ex8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ex8 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("CAA");
        list.add("COR");
        list.add("CO");
        list.add("CO");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println();
        System.out.println(list);
        luckySort(list,Comparator.comparing(String::length));
        System.out.println(list);
    }
        public static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        ArrayList<String> copy = new ArrayList<>();
        copy.addAll(0,strings);
        Collections.sort(copy);
        while (true){
            Collections.shuffle(strings);
            if(strings.equals(copy)){
                return;
            }
        }
    }
}
