package factor;

import java.util.ArrayList;
import java.util.List;

public class Factor {
    public  static List<Integer> integerAnalysis(int lengthFactor) {
        int index  = 2;
        List<Integer> listNumber = new ArrayList<Integer>();
        while (lengthFactor > 1) {
            if(lengthFactor % index  == 0) {
                lengthFactor /= index ;
                listNumber.add(index );
            } else {
                index  ++;
            }
        }

        if(listNumber.isEmpty()) {
            listNumber.add(lengthFactor);
        }

        return listNumber;
    }

    public static void printFactor()
    {
        int lengthFactor = 100;
        List<Integer> listNumbers = integerAnalysis(lengthFactor);

        int size = listNumbers.size();
        System.out.printf("Kết quả thừa số " + lengthFactor + " là: ");
        for (int index = 0; index  < size; index  ++) {
            System.out.printf(listNumbers.get(index ) + "x");
        }
        System.out.printf(String.valueOf(listNumbers.get(size - 1)));
    }
}
