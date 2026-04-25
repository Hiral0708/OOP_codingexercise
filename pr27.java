import java.io.*;
import java.util.Scanner;
public class StudentFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        BufferedReader br = null;
        try {
           fw = new FileWriter("students.txt");
            System.out.println("Enter details of 3 students:");
            for (int i = 1; i <= 3; i++) {
                System.out.println("\nStudent " + i);
                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Marks: ");
                int marks = sc.nextInt();
                fw.write(roll + " " + name + " " + marks + "\n");
            }
            fw.close();
            System.out.println("\n--- Student Records ---");
            br = new BufferedReader(new FileReader("students.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } 
        catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        } 
        finally {
            try {
                if (fw != null)
                    fw.close();
                if (br != null)
                    br.close();
                sc.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
