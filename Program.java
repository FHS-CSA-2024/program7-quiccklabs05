import java.util.Scanner;

//import stuff here

//Your code here 
public class Program7{
    public static void main(String [] args){
        //Old System
        Scanner myScanner = new Scanner (System.in);
        
        double schruteBucks = 0.0;
        double klevins = 0.0;
        double stanleyNickels = 0.0;
        double decimalSB = 0.0;
        
        //input
        System.out.println("Enter schrute-bucks: ");
        schruteBucks = myScanner.nextDouble();
        
        System.out.println("Enter klevins: ");
        klevins = myScanner.nextDouble();
        
        System.out.println("Enter stanley-nickels: ");
        stanleyNickels = myScanner.nextDouble();
        //Calculations
        klevins = klevins/20.0;
        stanleyNickels = stanleyNickels/240;
        decimalSB = (schruteBucks+klevins+stanleyNickels)+0.005;
        //Round
        decimalSB = (int)(decimalSB*100);
        decimalSB = (int)(decimalSB/100);
        
        System.out.print("Decimal schrute-bucks:" + decimalSB);
    }
}
//Paste console output below:
/*


*/
