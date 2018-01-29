package chapter6;
import java.util.Scanner;
/**
 * Displays how much yen is in a dollar.
 *
 * @author Dihlan Ortega
 */
//Dihlan Ortega

public class P6 {
    public static void main(String[] args){
         /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */Scanner input = new Scanner(System.in);  
          /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    int stop = 0;
    
    double converting = 0;
    String Answer;
    System.out.print("How many Euros does a dollar buy? ");
    double EurosToDollars = input.nextDouble();
        System.out.print("How many Pound Sterling does a dollar buy? ");
    double PoundsToDollars = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
    double YensToDollars = input.nextDouble();
while (stop == 0) {
     System.out.print("Please enter the number of dollars you want to convert: $");
     double dollars = input.nextDouble();
     
     System.out.print("Enter 'E' ro buy Euros, 'P' to buy Pounds, or 'Y' to buy Yen: ");
     String ConvertTo = input.next().toUpperCase();
           switch(ConvertTo){
               case "E":
                   converting = EurosToDollars;
                   System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros", dollars, Conversion(dollars, converting));;
                   break;
                   
               case "P":
                   converting = PoundsToDollars;
                   System.out.printf("For %.2f dollars, you will be able to buy %.2f Pound Sterlings", dollars,Conversion(dollars, converting));
                   break;
                   
               case "Y":
                   converting = YensToDollars;
                   System.out.printf("For %.2f dollars. you will be able to buy %.2f Yen", dollars, Conversion(dollars, converting));
                   break; 
           }         
      System.out.println(" Are there more conversions to perform? ");
        Answer = input.next().toUpperCase();
             switch(Answer) {
                case "YES":
                    continue;
                case "NO":
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invaild answer please enter 'Yes' or 'No'");
                    Answer = input.next().toUpperCase();
                    System.out.println("Invaild answer please enter 'Yes' or 'No'");
                    Answer = input.next().toUpperCase();
                    continue;
            }
        }
}
public static double Conversion(double d, double c ) {
   double FinalTotal; double fee;
    if (d <= 100) {
        fee = d * 0.10;
        FinalTotal = (d - fee) * c;
    }
    else  {
        fee = d * 0.05;
        FinalTotal = (d - fee) * c;
    }
        return FinalTotal;
    } 
}

