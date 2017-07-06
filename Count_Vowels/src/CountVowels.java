
public class CountVowels {
    /**
     * @param word A string
     * @return the number of vowels in word
     * 
     * Will print the number of each vowel in word
     * 
     * @author Christopher Chin
     * @date July 5. 2017
     * 
     */
    
    public static int countVowels (String word) {
        int numOfA = 0;
        int numOfE = 0;
        int numOfI = 0;
        int numOfO = 0;
        int numOfU = 0;
        
        String lowerWord = word.toLowerCase();
        
        for (int i = 0; i < lowerWord.length(); i ++) {
            if (lowerWord.charAt(i) == 'a') {
                numOfA++;
            } else if (lowerWord.charAt(i) == 'e') {
                numOfE++;
            } else if (lowerWord.charAt(i) == 'i') {
                numOfI++;
            } else if (lowerWord.charAt(i) == 'o') {
                numOfO++;
            } else if (lowerWord.charAt(i) == 'u') {
                numOfU++;
            }
        }
        
        System.out.println("There are " + numOfA + " a's, " + numOfE + " e's, " + numOfI + " i's, " + numOfO + " o's, and " + numOfU + " u's in the string " + word);
        
        return numOfA + numOfE + numOfI + numOfO + numOfU;
    }
}
