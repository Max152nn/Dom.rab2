package com.Inheritance;

import java.util.Objects;

public class LabelPoint extends Point{
    private String label;

    public LabelPoint(String label ,double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LabelPoint that = (LabelPoint) o;
        return label.equals(that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }

    @Override
    public String toString() {
        return "LabelPoint{" +
                "label='" + label + '\'' +
                '}';
    }
}
