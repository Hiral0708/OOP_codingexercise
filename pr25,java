import java.util.Scanner;
class TablePrinter {
    public synchronized void printTable(int num) {
        System.out.println("\nTable of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(300); // small delay for visibility
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class MyThread extends Thread {
    private TablePrinter obj;
    private int number;
    public MyThread(TablePrinter obj, int number) {
        this.obj = obj;
        this.number = number;
    }
    public void run() {
        obj.printTable(number);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        TablePrinter printer = new TablePrinter();
        MyThread t1 = new MyThread(printer, n1);
        MyThread t2 = new MyThread(printer, n2);
        t1.start();
        t2.start();
        sc.close();
    }
}
