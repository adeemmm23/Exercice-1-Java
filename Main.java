
// Main.java

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 2);
        Circle circle = new Circle(4, 0, 0);

        System.out.println(circle.getPerimetre());
        System.out.println(circle.isAppartien(point));

        circle.print();
    }
}