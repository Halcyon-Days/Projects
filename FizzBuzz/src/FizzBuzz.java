
public class FizzBuzz {
    
    /**

     * Will print all the numbers on the way to 100, if a multiple of 3 then prints fizz, if a multiple of 5 then prints buzz, if a multiple of 3 and 5 then prints fizzbuzz
     * 
     * @author Christopher Chin
     * @date July 5. 2017
     * 
     */
    public static void fizzbuzz() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
