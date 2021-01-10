package com.Inheritance;

public abstract class Shape {
    public Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy){
        new Point(point.getX()+dx,point.getY()+dy);
    }

    public abstract Point getCenter();
}
