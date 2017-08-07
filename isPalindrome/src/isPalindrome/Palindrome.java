package isPalindrome;

public class Palindrome {

    /**
     * @param s a string
     * @return true if string is palindrome(ignoring spaces and capital letters) and false if not
     * 
     * @author Christopher Chin
     * @date August 7, 2017
     * 
     */
    
    
    static boolean isPalindrome(String s) {
        String stringText = s.replaceAll("\\s","").toLowerCase();
        
        for(int i = 0; i < stringText.length()/2; i ++) {
            if (stringText.charAt(i) != stringText.charAt(stringText.length() -1 - i)) {
                return false;
            }
        }
        
        return true;
    }
}
