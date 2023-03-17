import java.util.Arrays;

public class Array2Dim {
    public static void main (String [] args) {
        int[][] array = new int[5][5];
        Array2Dim.output(array);
    }
    public static void output (int[][] arrayAusgabe) {
        for (int i = 0; i < arrayAusgabe.length; i++) {
            System.out.print("\nArray " + i + ": ");
            for (int j = 0; j < arrayAusgabe[i].length; j++) {
                System.out.print("\t" + j);
            }
        }
    }
}
