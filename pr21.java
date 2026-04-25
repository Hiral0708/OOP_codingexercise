import java.util.Scanner;
class VotingApp {
    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote.");
        }
    }
    public static void main(String[] args) {
        VotingApp app = new VotingApp();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            app.checkEligibility(age);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } 
        finally {
            // Always executes
            System.out.println("Validation process completed");
            sc.close();
        }
    }
}
