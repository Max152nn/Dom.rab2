package com.Inheritance.ex7;

public class ex7 {
    public static void main(String[] args) {

    }

    public enum Color{
        BLACK,RED
                {
                    public Color getRed(){
                        return Color.RED;
                    }
                },
        BLUE{
            public Color getBlue(){
                return Color.BLUE;
            }
        },GREEN{
            public Color getGreen(){
                return Color.GREEN;
            }
        },
        CYAN,MAGNETA,YELLOW,WHITE;
    }
}
