package io.github.halcyon_daze.happy_numbers;

public class HappyNum {

    //From https://en.wikipedia.org/wiki/Happy_number, a number can be determined if its a happy number or not if it reaches an infinite sequence of 4, 16, 37, 58, 89, 145, 42, 20, 4, ...
    private final static int nonHappyConst = 4;
    
    /**
     * @param n a positive integer
     * @return true if a happy number, false if not
     * 
     * Will print all the numbers on the way to determining if a happy number, recursive method
     * 
     * @author Christopher Chin
     * @date June 30. 2017
     * 
     */
    
    public static boolean getHappy (int n) {
        System.out.println(n);
        
        if ( n == 1) {
            return true;
        } else if ( n == nonHappyConst) {
            return false;
        } else {
            int sum = 0;
            while ( n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            return getHappy(sum);
        }
    }
    
    /**
     * @param n a positive integer
     * @return true if a happy number, false if not
     * 
     * Will print all the numbers on the way to determining if a happy number, iterative method
     * 
     * @author Christopher Chin
     * @date June 30. 2017
     * 
     */
    
    public static boolean findHappy (int n) {
        while(true){
            System.out.println(n);
            
            if ( n == 1) {
                return true;
            } else if ( n == nonHappyConst) {
                return false;
            } else {
                int sum = 0;
                while ( n > 0) {
                    sum += Math.pow(n % 10, 2);
                    n /= 10;
                }
                n = sum;
            }
        }
    }
}
