import java.util.Scanner;

public class KmToMiles{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter distance in kilometer: ");
		int x=sc.nextInt();
		
		//Convert the kilometer distance into miles
		double miles=x* 0.621371;
		System.out.printf("The distance in miles is : %.2f", miles);
	}
}
