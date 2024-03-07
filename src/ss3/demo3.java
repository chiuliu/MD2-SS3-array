package ss3;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        int[][] svs = new int[4][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < svs.length ; i++) {
            for (int j = 0; j < svs[i].length ; j++) {
                System.out.printf("array[%d][%d] = ", i, j);
                svs[i][j] = scanner.nextInt();

            }

        }
        for (int i = 0; i < svs.length ; i++) {
            for (int j = 0; j < svs[i].length ; j++) {
                System.out.printf("array[%d][%d] = %d\n",i,j,svs[i][j]);

            }

        }
    }
}
