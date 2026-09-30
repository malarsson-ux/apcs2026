
/**
 * tells user if minivan door is open or closed
 *
 * Mattias
 * 9/29/2026
 */
import java.util.Scanner;
public class MinivanClass
{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // sets up main menu

        System.out.println("--- Minivan ---");
        // dashboard inputs
        System.out.print("Dashboard switch left door (0 or 1): ");
        int dashLeft = scan.nextInt();

        System.out.print("Dashboard switch right door (0 or 1): ");
        int dashRight = scan.nextInt();

        System.out.print("Child lock switch (0 or 1): ");
        int childLock = scan.nextInt();

        System.out.print("Master unlock switch (0 or 1): ");
        int masterUnlock = scan.nextInt();
        // handle inputs

        System.out.print("Inside handle left door (0 or 1): ");
        int insideLeft = scan.nextInt();

        System.out.print("Outside handle left door (0 or 1): ");
        int outsideLeft = scan.nextInt();

        System.out.print("Inside handle right door (0 or 1): ");
        int insideRight = scan.nextInt();

        System.out.print("Outside handle right door (0 or 1): ");
        int outsideRight = scan.nextInt();

        System.out.print("Gear shift setting (P, N, D, 1, 2, 3, R): ");
        String gear = scan.next().toUpperCase();

        boolean leftOpen = false;
        boolean rightOpen = false;
        // tests if gear is in park and the master lock is activated

        if (gear.equals("P") && masterUnlock == 1) {

            if (dashLeft == 1 || outsideLeft == 1 || (insideLeft == 1 && childLock == 0)) {
                leftOpen = true;
            }

            if (dashRight == 1 || outsideRight == 1 || (insideRight == 1 && childLock == 0)) {
                rightOpen = true;
            }

        }

        System.out.println("--- Status ---");
        // prints status via if stament
        if (leftOpen && rightOpen) {
            System.out.println("left door opens");
            System.out.println("right door opens");
        } else if (leftOpen) {
            System.out.println("left door opens");
        } else if (rightOpen) {
            System.out.println("right door opens");
        } else {
            System.out.println("both doors stay closed");
        }

        
    }
}

        
        
        
    


