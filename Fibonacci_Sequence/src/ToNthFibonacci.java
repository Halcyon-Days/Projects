
public class ToNthFibonacci {

    public static void main(String[] args) {
        System.out.println(toNthFibonacci(4));

    }
    
    public static int toNthFibonacci(int n){
        int previous = 1;
        int second_Previous = 0;
        
        for(int i = 0; i < n; i ++){
            previous += second_Previous;
            second_Previous = previous - second_Previous;
        }
        
        return previous + second_Previous;
    }

}
