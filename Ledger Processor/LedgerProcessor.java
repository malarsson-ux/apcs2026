
/**
 * Write a description of class LedgerProcessor here.
 *
 * Mattias Larsson
 * 9/30/2026
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class LedgerProcessor
{
    public static void main(String[] args) throws FileNotFoundException
    {
    
        File dataFile = new File("Transactions.txt");
        Scanner fileScan = new Scanner(dataFile);
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        int count = 0;
        double totalSales = 0.0;
    
        System.out.println("=== Daily Transaction Ledger ===");
        
        while (fileScan.hasNextLine()){
            String line = fileScan.nextLine();
            double price = Double.parseDouble(line);
            
            count++;
            totalSales+=price;
            System.out.println("Transaction #"+count+": "+money.format(price));
            
            
        }
        
        fileScan.close();
        double averageSales = totalSales / count;
        System.out.print("Total items Sold: " + count);
        System.out.print("Total Revenue: " + money.format(totalSales));
        
        
        
    }
}
