public class Point {

    private int x;
    private int y;
    public Point() {
        this.x = 5;
        this.y = 5;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("Using Default Constructor:");
        p1.display();
        Point p2 = new Point(10, 20);
        System.out.println("\nUsing Parameterized Constructor:");
        p2.display();
        Point p3 = new Point(p2);
        System.out.println("\nUsing Copy Constructor:");
        p3.display();
    }
}

output:
Using Default Constructor:
Point coordinates: (5, 5)
Using Parameterized Constructor:
Point coordinates: (10, 20)
Using Copy Constructor:
Point coordinates: (10, 20)
