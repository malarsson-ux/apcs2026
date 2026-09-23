
/**
 * Write a description of class MovieTicketPricer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class MovieTicketPricer
{
  public static void main(String[] args){
      final double REGULAR_PRICE = 12.50;
      final double DISCOUNT_PRICE = 8.00;
      final double IMAX_SURCHARGE = 5.00;
      final double IMAX_70MM_SURCHARGE = 8.00;
      
      
      Scanner scan = new Scanner(System.in);
      NumberFormat money = NumberFormat.getCurrencyInstance();
      
      System.out.println("---Movie Ticket Calc--");
      System.out.println("Select Movie Format: ");
      System.out.println("1 - Standard Format");
      System.out.println("2 - IMAX");
      System.out.println("1 - IMAX 70");
      System.out.print("Enter Choice (1-3): ");
      int format = scan.nextInt();
      
      System.out.print("Enter The Customers Age: ");
      int age = scan.nextInt();
      
      System.out.print("Is this a mantaniee showtome? (y/n)? ");
      String isMatinee = scan.next();
      
      boolean matinee = false;
      
      if (isMatinee.toLowerCase().equals("y"))
      
        matinee = true;
        
        
        System.out.print("Does the customer have a pass? (y/n)? ");
        String hasPass = scan.next();
        boolean pass  = hasPass.toLowerCase().equals("y");
        
        double ticketPrice;
      if (format == 1){  
            if (age < 13 || age >= 65){
                ticketPrice = DISCOUNT_PRICE;
                System.out.println("Status: Discount Applied!");
                
            }
            else {
                ticketPrice = REGULAR_PRICE;
                
                System.out.print("Status: Regular Rate Applied");
                
        
                                                    
            }
        }  
        else if (format == 2){
            ticketPrice = REGULAR_PRICE + IMAX_SURCHARGE;
            System.out.print("Status: IMAX Surcharge applied");
    
        }
        else if (format == 3){
            ticketPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;
            System.out.print("Status: IMAX 70MM Surcharge applied");
        }
        else{
            
        }
    
        System.out.print("Total Due: " + money.format(xticketPrice));
      
    
      
    

    }
}