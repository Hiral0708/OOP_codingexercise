import java.util.Scanner;
interface Exam {
    boolean isPassed(int mark);
}
interface Classify {
    String getDivision(double average);
}
class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40; 
    }
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        System.out.print("Enter average: ");
        double avg = sc.nextDouble();
        if (r.isPassed(marks)) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
        System.out.println("Division: " + r.getDivision(avg));
    }
}
