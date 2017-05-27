package io.github.halcyon_daze.binary_converter;

/**
 * Can convert numbers in decimal format to binary, and vice versa
 * @author Christopher Chin
 * @date May 27. 2017
 * 
 */

public class BinaryDecimalConvert {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(convertDecimalToBinary(224));
        System.out.println(convertBinaryToDecimal("10"));

    }

    /**
     * @param binaryNumber a string containing a number in binary formatt (ex "100110")
     * @return the passed binary number in decimal formatt
     * 
     * @author Christopher Chin
     * @date May 27. 2017
     * 
     */
    public static int convertBinaryToDecimal (String binaryNumber){
       if (!binaryNumber.matches("[01]+")){
           System.out.println(convertDecimalToBinary(224));
           throw new RuntimeException("Number was not passed as a binary number");
       }
       
       int decimalNumber = 0; 
       
       for (int i = 0; i < binaryNumber.length(); i++){
           if (binaryNumber.charAt(i) == '1'){
               decimalNumber += Math.pow(2, binaryNumber.length() - 1 - i);
           }
       }
       
       return decimalNumber;
    }
    
    /**
     * @param decimalNumber a number in decimal format
     * @return a string containing the passed decimal number in binary format
     * 
     * @author Christopher Chin
     * @date May 27. 2017
     * 
     */
    public static int convertDecimalToBinary (int decimalNumber){
        int i = 0;
        String binaryNumber = new String();
        
        while (decimalNumber > Math.pow(2, ++i)) {
        }
        
        while (i >= 0) {
            if (decimalNumber >= Math.pow(2, i)) {
                decimalNumber -= Math.pow(2, i);
                binaryNumber += "1";
            } else {
                binaryNumber += "0"; 
            }
            
            i--;
        }
        
        return Integer.valueOf(binaryNumber);
    }
}
