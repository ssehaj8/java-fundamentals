import java.util.Scanner;

public class AverageOf3Numbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int a=sc.nextInt();
		System.out.print("Enter number2: ");
		int b=sc.nextInt();
		System.out.print("Enter number3: ");
		int c=sc.nextInt();

		//Calculate the average of the 3 numbers
		double avg=(a+b+c)/3;
		System.out.print("Average of the three numbers: " +avg);

}
}
