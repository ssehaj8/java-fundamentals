import java.util.*;

public class SimpleInterestCalculator{
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the principal amount: ");
        	int principal = sc.nextInt();

        	System.out.print("Enter the current rate: ");
        	double rate = sc.nextDouble();

		System.out.print("Enter the time period: ");
        	int time = sc.nextInt();	

        	// Calculating the simple interest
        	double interest = (principal * rate * time) / 100;

        	System.out.printf("The simple interest for current principle: %.2f %n", interest);

    }

}
