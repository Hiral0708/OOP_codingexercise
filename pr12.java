import java.util.Scanner;
class VolumeCalculator {
    double calculateVolume(double side) {
        return side * side * side;
    }
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();

        System.out.println("Enter side of Cube:");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + vc.calculateVolume(side));

        System.out.println("\nEnter length, width, height of Cuboid:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Cuboid: " + vc.calculateVolume(l, w, h));

        System.out.println("\nEnter radius of Sphere:");
        double r = sc.nextDouble();
        System.out.println("Volume of Sphere: " + vc.calculateVolume(r, true));
    }
}
