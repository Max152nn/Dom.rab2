package com.InterfacesAndLambdaExpressions.ex12;

import java.io.File;
import java.io.FilenameFilter;

public class ex12 {

    public static void main(String[] args) {
        String dir = "C:\\Users\\Mudreishiy\\Desktop\\1";
        String ext = ".txt";
        withExtension(dir,ext);
    }

    private static void withExtension(String path, String extension) {
       File[] fil = new File(path).listFiles((dir, name) -> name.endsWith(extension));
       for (File a:fil){
           System.out.println(a);
       }
    }
}
