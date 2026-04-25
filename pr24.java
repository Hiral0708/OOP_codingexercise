import java.util.Scanner;
class NumberThread extends Thread {
    private int start, end;
    private String name;
    public NumberThread(int start, int end, String name) {
        this.start = start;
        this.end = end;
        this.name = name;
    }
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(name + ": " + i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end for T1: ");
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();

        System.out.print("Enter start and end for T2: ");
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();

        System.out.print("Enter start and end for T3: ");
        int s3 = sc.nextInt();
        int e3 = sc.nextInt();
        NumberThread t1 = new NumberThread(s1, e1, "T1");
        NumberThread t2 = new NumberThread(s2, e2, "T2");
        NumberThread t3 = new NumberThread(s3, e3, "T3");
        try {
            t1.start();
            t1.join();   
            t2.start();
            t2.join();  
            t3.start();
            t3.join();   
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        sc.close();
    }
}
