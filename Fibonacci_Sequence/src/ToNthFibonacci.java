
public class ToNthFibonacci {

    public static void main(String[] args) {
        System.out.println(toNthFibonacci(12));
        System.out.println(prlongToNthFibonacci(6));

    }
    
    /**
     * @param n How many fibonacci numbers to print
     * @return the value of the nth fibonacci 
     * @author Christopher Chin
     * 
     * Recursive method, Helper Function
     * Works up to n = 93 before becomes too big for size of long 
     */
    public static long toNthFibonacci(long n){
        
        if (n < 0) {
            throw new RuntimeException("Not a valid index!");
        } 
        
        return prlongFibonacci(0, 1, n);
    }
    
    /**
     * @param n How many fibonacci numbers to print
     * @return the value of the nth fibonacci 
     * @author Christopher Chin
     * 
     * Recursive Function
     * Works up to n = 93 before becomes too big for size of long 
     */
    public static long prlongFibonacci(long currentTerm, long nextTerm, long n){
        if(n == 0){
            return nextTerm - currentTerm;
        }
        System.out.println(currentTerm);
        return prlongFibonacci(nextTerm, currentTerm + nextTerm, n-1);
    }

    /**
     * @param n How many fibonacci numbers to print
     * @return the value of the nth fibonacci 
     * @author Christopher Chin
     * 
     * Iterative Method     
     * Works up to n = 93 before becomes too big for size of long 
     */
    public static long prlongToNthFibonacci(long n){
        long currentTerm = 0;
        long nextTerm = 1;

        for(long i = 0; i < n; i ++){
            System.out.println(currentTerm);
            nextTerm += currentTerm;
            currentTerm = nextTerm - currentTerm;
        }
        
        return nextTerm - currentTerm;
    }
}
