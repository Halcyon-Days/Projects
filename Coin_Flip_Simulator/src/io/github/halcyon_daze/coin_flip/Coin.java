package io.github.halcyon_daze.coin_flip;

import java.util.Random;

public class Coin {
    
    private final int HEADS = 0;
    //private final int TAILS = 1;
    
    /**
     * @param n positive integer > 0
     * 
     * simulates flipping a coin n times, prints number of times heads and tails occur
     * 
     * @author Christopher Chin
     * @date July 1,. 2017
     * 
     */
    
    public void flipCoin(int n) {
        int numHeads = 0;
        int numTails = 0;
        Random side = new Random();
        
        for (int i = 0; i < n; i ++) {
            if ( side.nextInt() % 2 == HEADS) {
                numHeads++;
            } else {
                numTails++;
            }
        }
        
        System.out.println("Flipped Coin " + n + " times");
        System.out.println("Was heads " + numHeads + " times, which was " + 100.00 * numHeads/(numTails + numHeads) + "%");
        System.out.println("Was tails " + numTails + " times, which was " + 100.00 * numTails/(numTails + numHeads) + "%");
    }
}
