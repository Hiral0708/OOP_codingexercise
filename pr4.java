import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();
        double weightKg = pounds * 0.45359237;
        double heightMeters = inches * 0.0254;
        double bmi = weightKg / (heightMeters * heightMeters);
      
        System.out.printf("Your BMI is: %.2f%n", bmi);

        sc.close();
    }
}

output:
Enter weight in pounds: 
150
Enter height in inches:
65
Your BMI is:24.96
Enter weight in pounds:
120
Enter height in inches: 
60
Your BMI is: 23.44
