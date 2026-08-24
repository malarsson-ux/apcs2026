
/**
 * Weekly Budget
 *
 * Mattias Larsson
 * Last Updated 8/21/2026
 */

import java.util.Scanner;

public class WeeklyBudget
{
    // Calculate weekly lunch spending and remaining money
    public static void main(String[] args){
        String name;
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
        //Instantiate the scanner object to read from the keyboard
        Scanner scan = new Scanner (System.in);
        
        //Read a String (Object)
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        // Read doubles (floating point number)
        System.out.print("Enter your weekly allowance: $");
        allowance = scan.nextDouble();
        
        System.out.print("Enter the price of one school lunch: $");
        lunchPrice = scan.nextDouble();
        
        // Read an Integer
        System.out.print("Enter the number of school lunches you ordered this week");
        lunchesPerWeek = scan.nextInt();
        
        //perform calcualtions
        totalCost = lunchPrice * lunchesPerWeek;
        remaining = allowance - totalCost; 
        
        System.out.println(allowance);
        System.out.println(totalCost);
        System.out.println(remaining);
        
    }
}
