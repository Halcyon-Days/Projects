package io.github.halcyon_daze.fast_expo;

public class FastExpo {

    /**
     * Implements a program that finds the value of an integer raised to a power
     * 
     * Helped from http://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/
     * 
     * @param base base value for exponential
     * @param power power for exponential
     * @return base^power
     * 
     * @author Christopher Chin
     * @date June 19. 2017
     * 
     */
    public static double getPow(int base, int power){
       if (power == 0) {
           return 1;
       }
       
       double temp = getPow(base, power/2);
       
       if (power%2 == 0){
           return temp*temp;
       } else {
           if( power > 0) {
               return temp*temp*base;
           } else {
               return temp*temp/base;
           }
       }
    }
}
