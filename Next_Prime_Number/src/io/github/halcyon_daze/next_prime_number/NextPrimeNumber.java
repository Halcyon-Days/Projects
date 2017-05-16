package io.github.halcyon_daze.next_prime_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextPrimeNumber {

    /**
     * Repeatedly finds the next prime number after input from user, and ends when user types "stop"
     * @author Christopher Chin
     * @date May 16. 2017
     * 
     */
    public static void main(String[] args) throws IOException {
        long currentPrime = 1;
        BufferedReader nextCommandBuffer = new BufferedReader(new InputStreamReader(System.in));
        String command;
        
        do {
            currentPrime = GetNextPrimeNumber(currentPrime);
            System.out.println(currentPrime);
            
            System.out.println("Press Enter to get the next Prime Number or type stop to end the program");
            command = (String) nextCommandBuffer.readLine();
        } while (!(command.equals("stop")));
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

    /**
     * @param n a number to find the next prime number after
     * @return the next prime number after
     * @author Christopher Chin
     * @date May 16. 2017
     * 
     */
    public static long GetNextPrimeNumber(long n){
        
        while(!isPrimeNumber(++n)){
        }
        
        return n;
    }
}
