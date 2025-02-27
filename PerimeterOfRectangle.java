import java.util.Scanner;

public class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		double l=sc.nextDouble();
		System.out.println("Enter the width: ");
		double w=sc.nextDouble();
	
		//Calculate perimeter of rectangle
		double perimeter=2*(l+w);

		System.out.printf("Permeter of rectangle: %.2f", perimeter);
	
	}
}
