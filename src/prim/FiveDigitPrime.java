package prim;

import java.util.ArrayList;
import java.util.List;

public class FiveDigitPrime {
    private static final int PRIME_MIN = 2;
     public static List fiveDigitPrime(int sum) {
         List<Integer> listPrime = new ArrayList<Integer>();
         for(int index = 10001; index < 99999; index += 2) {
             if(checkPrime(index) && sumDigit(index) == sum) {
                 listPrime.add(index);
             }
         }
         return listPrime;
     }
     private static int sumDigit(int number) {
         int sum = 0;
         while (number > 1) {
             sum += number % 10;
             number /= 10;
         }
         return sum;
     }
     private static boolean checkPrime(int checkNumber) {
         if (checkNumber < PRIME_MIN) {
             return false;
         }
         int calculate = (int)Math.sqrt(checkNumber);
         for(int index = 2; index <= calculate; index ++) {
             if(checkNumber % index == 0) {
                 return false;

             }
         }
         return true;
     }
}
