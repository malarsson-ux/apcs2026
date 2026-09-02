
/**
 * Write a description of class TextTransformer here.
 *
 * @author (Ma)
 * @version (a version number or a date)
 * 
 * 
 */
import java.util.Scanner;
public class TextTransformer
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Text Transformer");
        System.out.println("==========================================");
        
        System.out.print("Enter a Quote");
        String phrase = scan.nextLine();
        
        int phraseLength = phrase.length();
        System.out.println("Total Characters (Including Spaces): " + phraseLength);
        
        String securePhrase = phrase.replace('e', '3');
        securePhrase = securePhrase.replace('a', '@');
        
        System.out.println("Modified Phrase: " + securePhrase);
        System.out.println("Original Phrase: " + phrase); 
        
        String prefix = phrase.substring(0,5);
        System.out.println("First 5 Charaters: " + prefix);
        
        String remainder = phrase.substring(5);
        
        
    }
}
