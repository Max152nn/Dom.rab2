package com.InterfacesAndLambdaExpressions.ex11;

import java.io.File;

public class ex11 {
    public static void main(String[] args) {
        File f = new File("D:\\Games");
        ret(f);
    }

    public static void ret(File file){
        File[] files = file.listFiles();
        System.out.println("Files:");
        for (int i = 0; i < files.length; i++) {
            if (file.isDirectory()) {
                System.out.println(files[i].getName());
            }else {
                return;
            }
        }
    }
}
