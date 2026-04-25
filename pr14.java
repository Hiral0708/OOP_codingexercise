import java.util.Scanner;
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
class SavingAccount extends BankAccount {
    double interestRate = 4.0; // example 4%

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest (Saving Account): " + interest);
    }
}
class FixedDepositAccount extends BankAccount {
    double rate = 6.5; // interest rate
    int time = 2; // years

    void maturityAmount() {
        double maturity = balance + (balance * rate * time) / 100;
        System.out.println("Maturity Amount (FD): " + maturity);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount sa = new SavingAccount();
        System.out.println("Enter Saving Account Details:");
        System.out.print("Account No: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Initial Balance: ");
        double bal = sc.nextDouble();
        sa.openAccount(accNo, name, bal);
        sa.deposit(1000);
        sa.withdraw(500);
        sa.checkBalance();
        sa.calculateInterest();
        FixedDepositAccount fd = new FixedDepositAccount();
        System.out.println("\nEnter Fixed Deposit Details:");
        System.out.print("Account No: ");
        accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Deposit Amount: ");
        bal = sc.nextDouble();
        fd.openAccount(accNo, name, bal);
        fd.checkBalance();
        fd.maturityAmount();
    }
}
