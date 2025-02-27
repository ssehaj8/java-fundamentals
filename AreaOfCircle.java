import java.util.Scanner;

public class AreaOfCircle {
   	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter the radius of the circle: ");
        	double radius = scanner.nextDouble();

        	// Calculate the area of the circle using the formula: Area = π * r^2
        	double area = Math.PI * Math.pow(radius, 2);

        	// Display the result
        	System.out.printf("The area of the circle with radius %.2f is: %.2f\n", radius, area);
    	}
}
