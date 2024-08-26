import java.util.Scanner;

//import stuff here

//Your code here 
public class Program7{
    public static void main(String [] args){
        //Old System
        Scanner myScanner = new Scanner (System.in);
        int oldstanley_nickels = 1;
        int klevins = 12 * oldstanley_nickels;
        int oldschrute_bucks = 20 * klevins;
        
        oldstanley_nickels = 9;
        
        //New System
        int newschrute_bucks = 100 * oldstanley_nickels;
        
        System.out.println("Enter schrute_bucks: " + oldschrute_bucks);
        
        System.out.println("Enter klevins: " + klevins);
        
        System.out.println("Enter stanley_nickels: " + oldstanley_nickels);
        
        System.out.println("Decimal schrute_bucks = " +newschrute_bucks);
        
    }
}
//Paste console output below:
/*


*/
