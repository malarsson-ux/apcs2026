
/**
 * Generate A Random cash prize
 *
 * Mattias Larsson
 * Date Modified 8/26/26
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class PrizeGenerator
{
    public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); 
  NumberFormat money = NumberFormat.getCurrencyInstance();
  
  System.out.println("Welcome to the APCSA Prize Simulator!");
  System.out.println("-------------------------------------");
  System.out.print("Enter Your Name Idiot: ");
  String name = scan.nextLine();
  
  System.out.print("How Many Bands You Got: $");
  double startBalance = scan.nextDouble();
  
  int PrizeAmount = 10 + (int)(Math.random() * 91);
  
  int fee = 1 + (int)(Math.random() * 5);
  
}
}
