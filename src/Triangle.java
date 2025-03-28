import java.awt.Point;

public class Triangle extends Shape {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        super(new Point(
                (p1.x + p2.x + p3.x) / 3,
                (p1.y + p2.y + p3.y) / 3
        ));
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }


    private double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    @Override
    public double area() {
        double a = distance(p1, p2);
        double b = distance(p2, p3);
        double c = distance(p3, p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return distance(p1, p2) + distance(p2, p3) + distance(p3, p1);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
