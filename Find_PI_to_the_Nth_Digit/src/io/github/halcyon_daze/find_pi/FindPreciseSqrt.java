package io.github.halcyon_daze.find_pi;

import java.math.BigDecimal;

/*
 * Finds the precise square root of a number to a certain number of decimal points using the babylonian method
 * Adapted from http://stackoverflow.com/questions/13649703/square-root-of-bigdecimal-in-java, edits for precision on final digit
 * @param square the value to find the square root of
 * @param precision to how many decimal values to return
 * @return square root with precision decimals
 * @author Christopher Chin
 */
public class FindPreciseSqrt {
    
    public static BigDecimal GetPreciseSqrt (double square , int precision){
        BigDecimal sqrt = new BigDecimal(0);
        BigDecimal nextSqrt = new BigDecimal(Math.sqrt(square));
        BigDecimal bigSquare = new BigDecimal(square);
        
        while ( !nextSqrt.equals(sqrt)){
            sqrt = nextSqrt;
            nextSqrt = bigSquare.divide(sqrt, precision+1 , BigDecimal.ROUND_HALF_DOWN);
            nextSqrt = nextSqrt.add(sqrt);
            nextSqrt = nextSqrt.divide(BigDecimal.valueOf(2), precision+1 , BigDecimal.ROUND_HALF_DOWN);
        }
        
        return nextSqrt.setScale(precision, BigDecimal.ROUND_DOWN);
    }

}
