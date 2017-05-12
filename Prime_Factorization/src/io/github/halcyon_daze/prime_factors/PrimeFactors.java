package io.github.halcyon_daze.prime_factors;

import java.util.ArrayList;

/**
 * @author Christopher Chin
 * @date May 11. 2017
 *
 */

public class PrimeFactors {
    public static void main(String[] args){
        printPrimeFactors(-1);
        printPrimeFactors(10);
        printPrimeFactors(0);
        printPrimeFactors(33);
        printPrimeFactors(99);
        printPrimeFactors(30030);

    }
    
    /**
     * @param n the number to find the prime factor of
     * @return List of all prime factors of n
     * @author Christopher Chin
     * @date May 11. 2017
     * 
     * Recursive method, Helper Function
     */
    
    public static void printPrimeFactors(long n){
        if(n <= 1) {
            System.out.println(n + " is not a prime number, and has no prime factors");
            return;
        }
        
        ArrayList<Long> primeFactorList = new ArrayList<>();
        primeFactorList = findPrimeFactors(n, primeFactorList);
        
        if(primeFactorList.contains(n)){
            System.out.println( n + " is a prime number and has no prime factors");
        } else {
            System.out.println( primeFactorList + " are the prime factors");
        }
        
    }
    
    /**
     * @param n the number to find the prime factor of
     * @return List of all prime factors of n
     * @author Christopher Chin
     * @date May 11. 2017
     * 
     * Recursive method, Helper Function
     */
    public static ArrayList<Long> findPrimeFactors(long n, ArrayList<Long> primeFactorList){
        
        if(isPrimeNumber(n)) {
            primeFactorList.add(n);
        } else {
            for(long i = 2; i < n ; i++) {
                if (n % i == 0) {
                    primeFactorList = findPrimeFactors(i, primeFactorList);
                    primeFactorList = findPrimeFactors(n/i, primeFactorList);

                    return primeFactorList;
                }
            }
        }
        
        return primeFactorList;
    }
    
    /**
     * @param n the number to check if it is a prime number
     * @return true if a prime number, false otherwise
     * @author Christopher Chin
     * @date May 11. 2017
     * 
     */
    public static boolean isPrimeNumber(long n){
        for(long i = 2; i < n ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
