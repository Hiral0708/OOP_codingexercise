import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        int numerator = 0, denominator = 0;
        try {
                        if (args.length == 2) {
                numerator = Integer.parseInt(args[0]);
                denominator = Integer.parseInt(args[1]);
            } 
            else {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter numerator: ");
                numerator = sc.nextInt();
                System.out.print("Enter denominator: ");
                denominator = sc.nextInt();

                sc.close();
            }
            int result = numerator / denominator;
            System.out.println("\nNumerator   : " + numerator);
            System.out.println("Denominator : " + denominator);
            System.out.println("Result      : " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid command-line input. Enter integers only.");
        } 
        catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        }
    }
}
