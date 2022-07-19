package matrix;

import static util.Util.SCANNER;

public class Matrix {
    private static int numberOfColumns;
    private static int numberOfLines;
    private static int[][] matrix;

    public Matrix(int numberOfColumns, int numberOfLines) {
        this.numberOfColumns = numberOfColumns;
        this.numberOfLines = numberOfLines;
        matrix = new int[numberOfLines][numberOfColumns];
    }

    public static void setMatrix() {
        System.out.printf("Nhập ma trận: ");
        for(int linesIndex = 0; linesIndex < numberOfLines; linesIndex ++) {
            for(int columnsIndex = 0; columnsIndex < numberOfColumns; columnsIndex ++) {
                matrix[linesIndex][columnsIndex] = SCANNER.nextInt();
            }
        }
    }

    public static void searchMaxMatrix() {
        int max = matrix[0][0];
        int linesIndexMax = 0;
        int columnsIndexMax = 0;
        for(int linesIndex = 0; linesIndex < numberOfLines; linesIndex ++) {
            for(int columnsIndex = 0; columnsIndex < numberOfColumns; columnsIndex ++) {
                int variable = matrix[linesIndex][columnsIndex];
                if(variable > max) {
                    max = variable;
                    linesIndexMax = linesIndex;
                    columnsIndexMax = columnsIndex;
                }
            }
        }
        System.out.printf("Giá trị lớn nhất là: " + max + "\n");

    }

    private static boolean checkPrime(int length) {
        if (length < 2) {
            return false;
        }
        for (int i = 2; i * i <= length; i++) {
            if (length % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime() {
        for(int linesIndex = 0; linesIndex < numberOfLines; linesIndex ++) {
            for(int columnsIndex = 0; columnsIndex < numberOfColumns; columnsIndex ++) {
                int variable = matrix[linesIndex][columnsIndex];
                if (checkPrime(variable)) {
                    System.out.print(variable + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

}
