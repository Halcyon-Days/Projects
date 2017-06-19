package io.github.halcyon_daze.fast_expo;

public class FastExpo {

    public static double getExpo(int base, int power){
       if (power == 0) {
           return 1;
       }
       
       double temp = getExpo(base, power/2);
       
       if (power%2 == 0){
           return temp*temp;
       } else {
           if( power > 0) {
               return temp*temp*base;
           } else {
               return temp*temp/base;
           }
       }
    }
}
