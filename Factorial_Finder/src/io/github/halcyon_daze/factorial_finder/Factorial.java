package io.github.halcyon_daze.factorial_finder;


public class Factorial{
    /*
    * Finds the factorial of a passed value, iterative method
    * @param n number to find factorial of
    * @return factorial of number as an integer, returns 0 if n is negative
    * @author Christopher Chin
    * 
    */
   public static int getFactorial(int n){
       if(n < 0){
           return 0;
       }
       
       int factorial = 1;
       
       for(int i = 1; i <= n; i++){
           factorial *= i;
       }
       
       return factorial;
   }
    
   /*
   * Finds the factorial of a passed value, recursive method
   * @param n number to find factorial of
   * @return factorial of number as an integer, returns 0 if n is negative
   * @author Christopher Chin
   * 
   */
   public static int findFactorial(int n){
       if (n == 0){
           return 1;
       } else if (n < 0){
           return 0;
       } else {
           return n* findFactorial(n - 1);
       }
   }
}
