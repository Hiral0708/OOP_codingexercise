import java.util.Scanner;
public class BankAccount {
    private String accountHolderName;
    private double balance;
    private static double interestRate = 5.0; // default
    public BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }
    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }
    public void display() {
        System.out.println("\nAccount Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.printf("Interest Earned: %.2f%n", calculateInterest());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name for Account 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter balance for Account 1: ");
        double bal1 = sc.nextDouble();
        sc.nextLine(); // clear buffer
        System.out.print("\nEnter name for Account 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter balance for Account 2: ");
        double bal2 = sc.nextDouble();
        BankAccount acc1 = new BankAccount(name1, bal1);
        BankAccount acc2 = new BankAccount(name2, bal2);
        System.out.println("\nBefore updating interest rate:");
        acc1.display();
        acc2.display();
        System.out.print("\nEnter new interest rate: ");
        double newRate = sc.nextDouble();
        BankAccount.setInterestRate(newRate);
        System.out.println("\nAfter updating interest rate:");
        acc1.display();
        acc2.display();

        sc.close();
    }
}
