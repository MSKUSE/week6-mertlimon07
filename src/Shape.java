public class Shape {


    private Point location;

    public Shape(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
public double area(){
        return 0;
}
    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "location=" + location +
                '}';
    }
}
