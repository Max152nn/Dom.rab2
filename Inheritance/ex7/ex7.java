package com.Inheritance.ex7;

public class ex7 {
    public static void main(String[] args) {

    }

    public enum Color {
        BLACK, RED, BLUE, GREEN,CYAN, MAGNETA, YELLOW, WHITE;

        public static Color getRed() {
            return Color.RED;
        }

        public static Color getBlue() {
            return Color.BLUE;
        }

        public static Color getGreen() {
            return Color.GREEN;
        }
    }
}
