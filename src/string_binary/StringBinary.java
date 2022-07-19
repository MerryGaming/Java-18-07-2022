package string_binary;



public class StringBinary {
    public static void binari(int length) {
        int[] arrayBinari = new int[length];
        int tich;
        do {
            tich = 1;
            System.out.println("");
            for (int i = 0; i < length; i++) {
                System.out.print(arrayBinari[i]);
                tich *= arrayBinari[i];
            }
            int index = length - 1;
            do {
                if (arrayBinari[index] == 0) {
                    arrayBinari[index] = 1;
                    for (int i = length - 1; i > index; i--) {
                        arrayBinari[i] = 0;
                    }
                    break;
                } else
                    index--;
            } while (index >= 0);
        } while (tich != 1);
    }
}
