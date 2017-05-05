package io.github.halcyon_daze.find_pi;

import java.math.BigDecimal;

public class FindPiToTheNthDecimal {

    private static final BigDecimal C = new BigDecimal(426880);
    private static final BigDecimal M = new BigDecimal(545140134);
    private static final BigDecimal L = new BigDecimal(13591409);
    private static final BigDecimal X = new BigDecimal(640320).pow(3).negate();
    

    public static void main(String[] args) {
        System.out.println(FindPiToNthDigit(3000));
    }

    /*
     * Takes a number and returns PI with that many decimal places by using Chudnovsky algorithm(https://en.wikipedia.org/wiki/Chudnovsky_algorithm) to calculate PI
     * @param NDecimals number of decimals to return PI with
     * @return piValue PI with NDecimals nubmer of decimals
     * @author Christopher Chin
     * 
     * Works until about 3000 decimal places, and then begins to slow as more decimals are added
     * formula is:  C*sqrt(10005) / (( (6i)! * (M*i +L)) / ( (3i)! * (i!)^3 * (-X) ))
     */
    public static BigDecimal FindPiToNthDigit(int NDecimals){
        
        BigDecimal piValue = new BigDecimal(0);
        BigDecimal piSum = new BigDecimal(0);
        BigDecimal cPrecise = C.multiply(FindPreciseSqrt.GetPreciseSqrt(10005, NDecimals));
                
        //Calculates the summation, each sum adds 13~ precise decimal points
        for(int i = 0; i < NDecimals/13 + 1; i++){
            piSum = M.multiply(BigDecimal.valueOf(i));
            piSum = piSum.add(L);
            piSum = piSum.multiply(GetFactorial(6*i));
            piSum = piSum.divide(X.pow(i), NDecimals + 1, BigDecimal.ROUND_HALF_UP);
            piSum = piSum.divide(GetFactorial(3*i), NDecimals + 1, BigDecimal.ROUND_HALF_UP);
            piSum = piSum.divide(GetFactorial(i).pow(3), NDecimals + 1, BigDecimal.ROUND_HALF_UP);
            piValue = piValue.add(piSum);
        }
        
        piValue = cPrecise.divide(piValue, NDecimals + 1, BigDecimal.ROUND_DOWN);
        
        return piValue;
    }
    
    /*
     * Finds the factorial of a passed value as a BigDecimal 
     * @param n number to find factorial of
     * @return factorial of number
     * @author Christopher Chin
     * 
     */
    public static BigDecimal GetFactorial(int n){
        BigDecimal factorial = new BigDecimal(1);
        
        for(int i = 1; i <= n; i++){
            factorial = factorial.multiply(BigDecimal.valueOf(i));
        }
        
        return factorial;
    }
}
