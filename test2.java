import java.io.IOException;
import java.sql.Array;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Input X Dimension size: ");
        var x = in.nextInt();
        System.out.println("Input Y Dimension size: ");
        var y = in.nextInt();


////        a = a-- - --a;
//        Boolean f = 123 > 123;
//        System.out.println(a);
//        System.out.println(f);
        in.close();
        int[][] arr  = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }

}


