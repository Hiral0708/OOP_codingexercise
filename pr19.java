import java.util.Scanner;
class Student {
    protected int rollNo;
    protected String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}
class Result extends Student {
    private int marks1, marks2, marks3;
    public Result(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("\n===== MARK SHEET =====");
        displayStudent();
        System.out.println("----------------------");
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("----------------------");
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();
        Result student = new Result(rollNo, name, m1, m2, m3);
        student.displayResult();

        sc.close();
    }
}
