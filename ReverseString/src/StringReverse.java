
public class StringReverse {

    /**
     * @param word a string
     * @return a string, with all characters reversed from the passed word
     * 
     * 
     * @author Christopher Chin
     * @date July 5. 2017
     * 
     */
    
    public static String getReverse(String word) {
        StringBuilder reversedWord = new StringBuilder();
        
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        
        return reversedWord.toString();
    }
}
