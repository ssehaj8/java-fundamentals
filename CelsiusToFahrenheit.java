import java.util.*;
  public class CelsiusToFahrenheit{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the temprature in Celsius:");
      int celsius_temprature=sc.nextInt();
      int fahrenheit_temprature=(celsius_temprature *9/5)+32;
      System.out.print("The Temprature in Fahrenheit is:"+ fahrenheit_temprature);
    }
   } 
