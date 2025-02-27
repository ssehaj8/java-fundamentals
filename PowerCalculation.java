import java.util.Scanner;

public class PowerCalculation{
        public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the base number: ");
       		int x=sc.nextInt();
        	System.out.println("Enter the exponent: ");
        	int a=sc.nextInt();

        	//Calculate the number raised to power of exponent
        	double power=Math.pow(x,a);

        	System.out.printf("Power: "+ power);

	}
}
