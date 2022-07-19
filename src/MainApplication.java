import factor.Factor;

import matrix.Matrix;
import prim.FiveDigitPrime;
import string_binary.StringBinary;

public class MainApplication {
    public static void main(String[] args) {
        Factor.printFactor();
        StringBinary.binari(3);
        System.out.println("\nSố nguyên tố 5 chữ số: " + FiveDigitPrime.fiveDigitPrime(29));

        Matrix matrix = new Matrix(3,4);
        matrix.setMatrix();
        matrix.searchMaxMatrix();

        System.out.println("Ma trận khi sắp xếp số nguyên tố là: ");
        matrix.printPrime();





    }

}
