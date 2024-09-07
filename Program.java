import java.util.Scanner;

//import stuff here

//Your code here 
public class Program7{
    public static void main(String [] args){
        //Old System
        double oldstanleyNickels = 0.0;
        
        Scanner myScanner = new Scanner (System.in);
        
        double schruteBucks = 0.0;
        double klevins = 0.0;
        double newstanleyNickels = 0.0;
        double decimalSB = 0.0;
        
        //input
        System.out.println("Enter schrute-bucks: ");
        schruteBucks = myScanner.nextDouble();
        
        System.out.println("Enter klevins: ");
        klevins = myScanner.nextDouble();
        
        System.out.println("Enter stanley-nickels: ");
        newstanleyNickels = myScanner.nextDouble();
        
        //Calculations
        oldstanleyNickels = klevins/12.0;
        newstanleyNickels = (240 * oldstanleyNickels)/100;
        decimalSB = (schruteBucks+klevins+newstanleyNickels)+0.005;
        
        //Round
        decimalSB = (int)(decimalSB*100);
        decimalSB = (int)(decimalSB/100);
        
        
        System.out.print("Decimal schrute-bucks =" + " " + "$" + decimalSB);
    }
}
//Paste console output below:
/*
Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickels: 
9
Decimal schrute-bucks = $27.0

*/
