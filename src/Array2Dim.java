import java.util.Random;

public class Array2Dim {

    public static void output(int[][] arr) {
        if (arr == null) {
            return;
        }

        int numRows = arr.length;
        int numCols = arr[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] arr1, int[][] arr2) {
        if (arr1 == null || arr2 == null) {
            return;
        }

        int numRows1 = arr1.length;
        int numCols1 = arr1[0].length;
        int numRows2 = arr2.length;
        int numCols2 = arr2[0].length;

        if (numRows1 != numCols2 || numCols1 != numRows2) {
            return;
        }

        int[][] result = new int[numRows2][numCols2];

        for (int i = 0; i < numRows2; i++) {
            for (int j = 0; j < numCols2; j++) {
                result[i][j] = arr1[j][i];
            }
        }

        for (int i = 0; i < numRows2; i++) {
            for (int j = 0; j < numCols2; j++) {
                arr2[i][j] = result[i][j];
            }
        }
    }

    public static void main(String[] args) {
        // Erzeuge ein 2D-Array mit zufälligen Werten
        Random rand = new Random();
        int numRows1 = rand.nextInt(5) + 1;
        int numCols1 = rand.nextInt(5) + 1;
        int[][] arr1 = new int[numRows1][numCols1];
        for (int i = 0; i < numRows1; i++) {
            for (int j = 0; j < numCols1; j++) {
                arr1[i][j] = rand.nextInt(10);
            }
        }

        // Erzeuge ein 2D-Array mit gleicher Anzahl Zeilen/Spalten wie arr1
        int numRows2 = numCols1;
        int numCols2 = numRows1;
        int[][] arr2 = new int[numRows2][numCols2];

        // Gib das ursprüngliche arr1 aus
        System.out.println("Array 1:");
        output(arr1);

        // Vertausche Zeilen und Spalten von arr1 und schreibe das Ergebnis in arr2
        swap(arr1, arr2);

        // Gib das transponierte arr2 aus
        System.out.println("Array 2:");
        output(arr2);
    }
}
