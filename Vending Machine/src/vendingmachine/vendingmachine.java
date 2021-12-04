package vendingmachine;
import java.util.Scanner;
/**
 *
 * @author aidan9082 
 */
public class vendingmachine 
{

    public static void main(String[] args) 
    {
        double balance = 0;
        String command = "";
        Scanner keyboard = new Scanner(System.in);
   
        //runs a while loop while the character x is not imputed by the user
        while (!(command.equalsIgnoreCase ("X")))
        {
            /**
             * prints item cost, current balance, prints required characters, 
             * and characters for commands 
             * 
             **/
            System.out.printf("Item Cost: $1.25 Balance: " 
                             + "$%,.2f\n", balance);
            System.out.print("\nEnter Money(Q,D,N,B for Bill) "
                            + "or command (R,P,X): ");
            command = keyboard.nextLine();
            
            // exits the code and prints goodbye message 
            if (command.equalsIgnoreCase ("X"))
            {
                System.out.println("\nGoodbye!");
                System.exit(0);
            }
            /** 
             * depending on the balance total, either dispenses product 
             * and gives you any remaining change, 
             * or does not dispense anything
            **/
            else if (command.equalsIgnoreCase ("P"))
            {
                if (balance <= 0.00)
                {
                    System.out.println("\nUnable to dispense!\n");
                    balance = 0;
                }
                else if (balance < 1.25)
                {
                    System.out.println("\nUnable to dispense!\n");
                }
                else
                {
                    balance -= 1.25;
                    System.out.printf("\nGot Product with change: " 
                                 + "$%,.2f\n\n", balance);
                    balance = 0.00;
                }
            }
            //adds 0.25 to the balance            
            else if (command.equalsIgnoreCase ("Q"))
            {
                System.out.print("\n");
                balance += 0.25;
            }
            //adds 0.10 to the balance
            else if (command.equalsIgnoreCase ("D"))
            {
                System.out.print("\n");
                balance += 0.10;
            }
            //adds 0.05 to the balance
            else if (command.equalsIgnoreCase ("N"))
            {
                System.out.print("\n");
                balance += 0.05;
            }
            //adds 1.00 to the balance
            else if (command.equalsIgnoreCase ("B"))
            {
                System.out.print("\n");
                balance += 1.00;
            }
            //prints returning of balance and sets balance to 0
            else if (command.equalsIgnoreCase ("R"))
            {
                System.out.printf("\nMoney Returned: " + "$%,.2f\n\n", balance);
                balance = 0;
            }
            //prints error message if user inputs unknown character or message 
            else
            {
                System.out.println("\nInvalid Coin or Bill or Command\n");
            }
        }
    
    
    
    }
    
}
