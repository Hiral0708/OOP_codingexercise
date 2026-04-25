import java.util.Scanner;

public class Employee {
    private String employeeName;
    private double employeeSalary;
    public void readEmployeeData(Scanner sc) {
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        emp.readEmployeeData(sc);
        emp.displayEmployeeData();

        sc.close();
    }
}

output:
Enter employee name: 
John
Enter employee salary: 
50000
Employee Details:
Name: John
Salary: 50000.0
