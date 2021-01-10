package com.OOP;

//ex 5
public final class Point {
    private double X;
    private double Y;

    public Point() {
    }

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public Point translate(double x, double y){

        return new Point(getX() + x, getY() + y);
    }

    public Point scala(double f){
        return new Point(getX() * f, getY() * f);
    }
}
