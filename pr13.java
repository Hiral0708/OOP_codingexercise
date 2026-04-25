import java.util.Scanner;
class Shape {
    double d1, d2;
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}
class Triangle extends Shape {
    double calculateArea() {
        return 0.5 * d1 * d2;
    }
}
class Rectangle extends Shape {
    double calculateArea() {
        return d1 * d2;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        System.out.print("Enter base and height of Triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        t.getData(b, h);
        System.out.println("Area of Triangle: " + t.calculateArea());

        Rectangle r = new Rectangle();
        System.out.print("\nEnter length and breadth of Rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        r.getData(l, w);
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}
