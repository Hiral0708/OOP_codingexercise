public class Rectangle {
    double width = 1;
    double height = 1;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1:");
        System.out.println("Width = " + r1.width);
        System.out.println("Height = " + r1.height);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("\nRectangle 2:");
        System.out.println("Width = " + r2.width);
        System.out.println("Height = " + r2.height);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}

output:
Rectangle 1:
Width = 1.0
Height = 1.0
Area = 1.0
Perimeter = 4.0

Rectangle 2:
Width = 5.0
Height = 3.0
Area = 15.0
Perimeter = 16.0
