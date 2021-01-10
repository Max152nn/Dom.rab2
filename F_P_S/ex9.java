package com.F_P_S;

public class ex9 {
    public static void main(String[] args) {
        String str = "World";
        System.out.print("World" == str);
        System.out.print(" ");
        System.out.println("World".equals(str));

        //false true
        String greeting = "Hello, World!";
        String location = greeting.substring(7, 12);
        System.out.print("World" == location);
        System.out.print(" ");
        System.out.println("World".equals(location));

        //false true
        String join = String.join("", "W", "orld");
        System.out.print("World" == join);
        System.out.print(" ");
        System.out.println("World".equals(join));

        //false true
        String str2 = new String("World");
        System.out.print("World" == str2);
        System.out.print(" ");
        System.out.println("World".equals(str2));
    }
}
