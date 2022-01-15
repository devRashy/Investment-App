import java.util.Scanner;
import java.text.*;

public class Driver {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price per share:");
        double buyingPrice = scan.nextDouble();
        System.out.println("Enter the number of days you wanna invest");
        int numberOfDays = scan.nextInt();
        int day = 1;
        double closingPrice = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        double totalEarnings = 0;


        while(day <= numberOfDays){
            System.out.println("Enter the closing price for day "
                    + day + "  (any negative value ends the program: )");
            closingPrice = scan.nextDouble();
            if(closingPrice < 0.0) break;
            double earnings = closingPrice - buyingPrice;
            totalEarnings += earnings;
            if(earnings > 0.0 ){
                System.out.println("After day " + day + ", you earned " + df.format(earnings) + " per share.");
            } else if(earnings < 0.0) {
                System.out.println("After day " + day + ", you lost " +df.format((-earnings)) + " per  share");
            }
            else {
                System.out.println("After day " + day + ", you have " + " no earnings per share.");
            }
            day++;
        }
        scan.close();
        if(totalEarnings > 0 || totalEarnings == 0){
            System.out.println(" cheers! You made a total of " + totalEarnings + " in " + numberOfDays + "days");
        }
       else {
            System.out.println("oops you lost " + df.format((-totalEarnings ))+ " in " + numberOfDays + " days");
        }
    }

}

