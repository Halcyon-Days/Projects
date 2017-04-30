package io.github.halcyon_daze.find_pi;

import java.math.BigDecimal;

public class FindPiToTheNthDecimal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(FindPiToNthDigit(10));
        System.out.println(GetFactorial(12));
        System.out.println(GetFactorial(7));
        System.out.println(GetFactorial(4));
    }

    public static String FindPiToNthDigit(int NDecimals){
        
        String piString = new String();
        BigDecimal piValue = new BigDecimal(0);
        
        for(int i = 0; i < 12; i++){
            piValue = piValue.add(BigDecimal.valueOf(Math.pow((-1), i)*GetFactorial(6*i)*(13591409 + 545140134*i)) / ((GetFactorial(3*i))*Math.pow((GetFactorial(i)), 3)*Math.pow(640320, 3*i+3/2)));
        }
        
        piValue = 1/(piValue*12);
        System.out.println(piValue);
        return Double.toString(piValue);
    }
    
    public static double GetFactorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        
        return factorial;
    }
}
