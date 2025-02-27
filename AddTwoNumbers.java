import java.util.*;
 class AddTwoNumbers{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter First Number");
   int FirstNumber= sc.nextInt();
   System.out.print("Enter Second Number");
   int SecondNumber= sc.nextInt();
   int sum= FirstNumber+SecondNumber;
   System.out.print("The Sum of two numbers is" +sum);
  }
 }
