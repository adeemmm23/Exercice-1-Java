
// Circle.java

import java.lang.Math;

public class Circle {
    private final double pi = Math.PI;
    private double r = 0;
    private Point center;

    public Circle(double r, Point center) {
        this.r = r;
        this.center = center;
    }

    public Point getCenter() {
        return this.center;
    }

    public double getR() {
        return this.r;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setCenter(double r) {
        this.r = r;
    }

    public double getPerimetre() {
        return (2 * pi * this.r);
    }

    public double getSurface() {
        return (pi * Math.pow(r, 2));
    }

    public boolean isAppartien(Point point) {
        double distance = Math
                .sqrt(Math.pow((point.getX() - center.getX()), 2) + Math.pow((point.getY() - center.getY()), 2));
        if (distance <= this.r)
            return true;
        return false;
    }

    public void print() {
        System.out.println("r: " + r + " x: " + center.getX() + " y: " + center.getY());
    }
}
