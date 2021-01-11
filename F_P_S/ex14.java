package com.F_P_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex14 {
    public final static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        int[][] mas = new int[size][size];
        String chislo;

        System.out.println("Введите массив: ");
        for (int i = 0; i < size; i++) {
            a = reader.readLine();
            if (!("".equals(a))) {
                int[] numbers = Arrays.stream(a.split("\\s"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                for (int j = 0; j < size; j++) {
                    mas[i][j] = numbers[j];
                }
            }else {
                break;
            }
        }
        magicSquare(mas);
        printMatrix(mas);
    }

    private static void magicSquare(int[][] array){
        Set set = new HashSet();
        //str
        for(int i=0;i<array.length;i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
          //  System.out.println(sum);
            set.add(sum);
        }
        //column
        for(int i=0;i<array.length;i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
         //   System.out.println(sum);
            set.add(sum);
        }
        //diagonal
        int diag1 = 0;
        int diag2 = 0;
        for(int i=0;i<array.length;i++) {
            diag1 += array[i][i];
            diag2 += array[i][array.length-1-i];
        }
        set.add(diag1);
        set.add(diag2);

        if(set.size()==1){
            System.out.println("It`s a magic square");
        }else {
            System.out.println("It`s ordinary square");
        }
    }

    private static void printMatrix(int[][] array) {
            for (int i=0;i<array.length;i++){
                for (int j=0;j<array.length;j++){
                        System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
    }
}
