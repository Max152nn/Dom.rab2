package com.Inheritance;

public class Circle extends Shape implements Cloneable{
    private double radius;


    public Circle(Point point,double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return this.point;
    }

    @Override
    protected Circle clone()  {
        try{
            Circle cloned =  (Circle) super.clone();
            cloned.point = new Point(point.getX(),point.getY());
            return cloned;
        }catch (CloneNotSupportedException a){
           return null;
        }
    }
}
