package com.F_P_S;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(normalize360(-390.2));
        System.out.println(normalize3601(-390.2));
    }
    public static double normalize360(double angle) {
        //angle = angle % 359;
        angle = Math.floorMod((int) angle,359);
        if (angle < 0) {
            angle = angle + 359;
        }
        return angle;
    }

    public static double normalize3601(double angle) {
        angle = Math.floorMod((int) angle,359);
        if (angle < 0) {
            angle = angle + 359;
        }
        return angle;
    }
}
