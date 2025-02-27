import java.util.Scanner;

public class VolumeOfCylinder{
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the radius of the cylinder: ");
        	double radius = sc.nextDouble();

        	System.out.print("Enter the height of the cylinder: ");
        	double height = sc.nextDouble();

        	// Calculating the volume of the cylinder
        	double volume = Math.PI * Math.pow(radius, 2) * height;

        	System.out.printf("The volume of the cylinder is: %.2f cubic units%n", volume);
    	}
}
