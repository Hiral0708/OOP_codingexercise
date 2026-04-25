import java.util.Scanner;
class College {
    String collegeName;
    College(String collegeName) {
        this.collegeName = collegeName;
    }
    class Admission {
        String studentName;
        String course;
        void acceptDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();
            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }
        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name : " + collegeName);
            System.out.println("Student Name : " + studentName);
            System.out.println("Course       : " + course);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        College college = new College("SSASIT");
        College.Admission admission = college.new Admission();
        admission.acceptDetails();
        admission.displayDetails();
    }
}
