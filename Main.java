import java.util.Scanner;

/**
 *
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner for user input
   Scanner input = new Scanner(System.in);
  
   //ask user for integer
   System.out.println("Enter an integer");

   //get integer from user
   int integer = input.nextInt();

   //get the remaider
   int remainder = integer % 2;

   //determine if integer is even or odd
   if(remainder > 2){

   //tell them they picked an odd number 
   System.out.println("The integer you chose was odd");

   } else {

   //tell them they picked an even number
   System.out.println("The integer you chose was even ");

   } 
  }
}
