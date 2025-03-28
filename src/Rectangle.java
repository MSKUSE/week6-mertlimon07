public class Rectangle extends Shape{



    private int sideA , sideB;

    public static int counter=0;

    public int counterforobject=0;


    public Rectangle(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterforobject++;
    }

    public Rectangle(Point topLeft, int sideA) {
        super(topLeft) ;
        setSideA(sideA);
        setSideB(sideA);
        counter++;
        counterforobject++;
    }


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            this.sideA = 0;
            System.out.println("Side A can't be negative!!");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }



    public double perimeter(){
        return 2 * (sideA + sideB);
    }
    public double area(){
        return sideA * sideB;
    }


    @Override
    public String toString() {
        return "Rectangle{" +

                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", counterforobject=" + counterforobject +
                '}';
    }
}
