package com.InterfacesAndLambdaExpressions.ex13;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class ex13 {
    public static void main(String[] args) {
        File[] files = new File("C:\\Users\\Mudreishiy\\Desktop\\1").listFiles();
        sort(files);
    }

    private static void sort(File[] files) {
        Arrays.sort(files, Comparator.comparing(File::isFile));
        for (File a:files){
            System.out.println(a);
        }
    }
}
