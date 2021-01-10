package com.Inheritance;

public class Line extends Shape implements Cloneable{
        private Point to;
        private Point from;

    public Line(Point from,Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    @Override
    protected Line clone() {
        try{
            Line cloned = (Line)super.clone();
            cloned.point = new Point(point.getX(), point.getY());
            cloned.from = new Point(from.getX(), from.getY());
            cloned.to = new Point(to.getX(), to.getY());
            return cloned;
        }catch (CloneNotSupportedException a){
            return null;
        }
    }
}
