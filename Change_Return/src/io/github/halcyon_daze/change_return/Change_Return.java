package io.github.halcyon_daze.change_return;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * When given a cost, and the amount paid, calculates the number of each coin needed for change
 * @author Christopher Chin
 * @date May 24. 2017
 * 
 */

public class Change_Return {

    public static void main(String[] args) throws IOException {
        
        BufferedReader userInputBuffer = new BufferedReader(new InputStreamReader(System.in));
        String cost;
        String moneyGiven;
        
        System.out.println("Enter Cost: ");
        cost = (String) userInputBuffer.readLine();
        
        System.out.println("Enter The amount of money given: ");
        moneyGiven = (String) userInputBuffer.readLine();
        
        System.out.println("Your change is: ");
        printChange(cost, moneyGiven);
    }

    /**
     * When given a cost, and the amount paid, prints the number of each coin needed for change
     * @param cost the cost of the item(s) bought
     * @param moneyGiven the amount of money paid with
     * @return none
     * 
     * @author Christopher Chin
     * @date May 24. 2017
     * 
     */
    public static void printChange(String cost, String moneyGiven) {
            float leftoverMoneySum = (Math.round(Float.valueOf(moneyGiven) * 100) - Math.round(Float.valueOf(cost) * 100)); //multiplied by 100 for int calculations
           
            if(leftoverMoneySum < 0 ){
                System.out.println("Need an additional $" + -1*leftoverMoneySum/100);
                return;
            }
            
            int nDollars = (int) leftoverMoneySum / 100;
            System.out.println("$ "+ nDollars);
            leftoverMoneySum -= nDollars*100;
            
            int nQuarters = (int) leftoverMoneySum / 25;
            System.out.println(nQuarters + " Quarters");
            leftoverMoneySum -= nQuarters*25;
            
            int nDimes = (int) leftoverMoneySum / 10;
            System.out.println(nDimes + " Dimes");
            leftoverMoneySum -= nDimes*10;
            
            int nNickels = (int) leftoverMoneySum / 5;
            System.out.println(nNickels + " Nickels");
            leftoverMoneySum -= nNickels*5;
            
            System.out.println((int) leftoverMoneySum + " Pennies");
    }

}
