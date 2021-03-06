package io.github.halcyon_daze.collatz_conjecture;

public class Collatz {

    /**
     * @param n number to use collatz algorithim on
     * @return number of steps it takes to reach 1
     * 
     * @author Christopher Chin
     * @date June 21. 2017
     * 
     */
    
    public static int getCollatz(int n){
        if (n <= 0) {
            System.out.println("Algoritim does not work for negative numbers!");
            return -1;
        } else if (n == 1) {
            System.out.println(n);
            return 0;
        } else if (n % 2 == 0) {
            System.out.println(n);
            return getCollatz( n/2) + 1;
        } else {
            System.out.println(n);
            return getCollatz( 3*n + 1) + 1;
        }
    }
}
