import java.lang.Math;

public class Circle extends Point {
    private final double pi = Math.PI;
    private double r = 0;

    public Circle(double r, double x, double y) {
        super(x, y);
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
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
                .sqrt(Math.pow((point.getX() - this.getX()), 2) + Math.pow((point.getY() - this.getY()), 2));
        if (distance <= this.r)
            return true;
        return false;
    }

    public void print() {
        System.out.println("r: " + r + " x: " + this.getX() + " y: " + this.getY());
    }

}
