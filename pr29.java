import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MarksList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();
        try {
            System.out.print("Enter number of students (minimum 5): ");
            int n = sc.nextInt();
            if (n < 5) {
                System.out.println("Please enter at least 5 students.");
                return;
            }
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter marks of student " + i + ": ");
                int m = sc.nextInt();
                marks.add(m);
            }
            System.out.println("\nAll Marks:");
            for (int m : marks) {
                System.out.print(m + " ");
            }
            int max = Collections.max(marks);
            int min = Collections.min(marks);
            System.out.println("\n\nHighest Marks: " + max);
            System.out.println("Lowest Marks : " + min);
        } 
        catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } 
        finally {
            sc.close();
        }
    }
}
