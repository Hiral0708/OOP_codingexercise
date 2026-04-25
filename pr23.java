import java.util.Scanner;
class NumberThread implements Runnable {
    private int start, end, delay;
    private String name;
    public NumberThread(int start, int end, int delay, String name) {
        this.start = start;
        this.end = end;
        this.delay = delay;
        this.name = name;
    }
    public void run() {
        try {
            for (int i = start; i <= end; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start for Thread 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter end for Thread 1: ");
        int e1 = sc.nextInt();
        System.out.print("Enter delay for Thread 1 (ms): ");
        int d1 = sc.nextInt();
        System.out.print("\nEnter start for Thread 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter end for Thread 2: ");
        int e2 = sc.nextInt();
        System.out.print("Enter delay for Thread 2 (ms): ");
        int d2 = sc.nextInt();
        Thread t1 = new Thread(new NumberThread(s1, e1, d1, "Thread 1"));
        Thread t2 = new Thread(new NumberThread(s2, e2, d2, "Thread 2"));
        t1.start();
        t2.start();
        sc.close();
    }
}
