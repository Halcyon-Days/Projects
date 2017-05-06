/**
 * 
 */
package io.github.halcyon_daze.find_e;

import java.math.BigDecimal;

/**
 * @author Christopher Chin, May 5, 2017
 *
 */
public class FindeToTheNthDecimal {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(FindeToNthDigit(1000));
    }

    
    /**
     * @param NDecimals How many decimal places will be returned from e
     * @return e, with NDecimal number of decimal points
     * @author Christopher Chin
     * 
     * Works to about 1000 decimal places, and then begins to slow down as more decimal places are calculated
     */
    public static BigDecimal FindeToNthDigit(int NDecimals){
        BigDecimal eValue = new BigDecimal(0);
        BigDecimal eSum = new BigDecimal(0);
        
        for(int i = 0; i < NDecimals + 1; i++){
            eValue = BigDecimal.valueOf(2).multiply(BigDecimal.valueOf(i));
            eValue = eValue.add(BigDecimal.valueOf(2));
            eValue = eValue.divide(GetFactorial(2*i+1), NDecimals + 2, BigDecimal.ROUND_HALF_UP);
            eSum = eSum.add(eValue);
        }
        
        return eSum.setScale(NDecimals, BigDecimal.ROUND_DOWN);
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
