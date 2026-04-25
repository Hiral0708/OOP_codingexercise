import java.util.Scanner;
class Employee {
    String name;
    String department;
    void getDetails(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department   : " + department);
    }
}
class Manager extends Employee {
    int teamSize;
    String project;
    void getManagerDetails(Scanner sc) {
        getDetails(sc); 
        System.out.print("Enter Team Size: ");
        teamSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Project Name: ");
        project = sc.nextLine();
    }
    @Override
    void displayDetails() {
        System.out.println("Manager Name : " + name);
        System.out.println("Department   : " + department);
        System.out.println("Team Size    : " + teamSize);
        System.out.println("Project      : " + project);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Details:");
        Employee e = new Employee();
        e.getDetails(sc);
        System.out.println("\nEnter Manager Details:");
        Manager m = new Manager();
        m.getManagerDetails(sc);
        System.out.println("\n--- Employee Details ---");
        e.displayDetails();
        System.out.println("\n--- Manager Details ---");
        m.displayDetails();
        System.out.println("\n--- Using Parent Reference ---");
        Employee ref;
        ref = e;
        ref.displayDetails();  // Employee version
        ref = m;
        ref.displayDetails();  // Manager version
    }
}
