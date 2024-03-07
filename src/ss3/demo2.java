package ss3;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm môn Toán, Lý, Hóa : ");

        float[] diems = new float[3];
        for (int i = 0; i < diems.length ; i++) {
            diems[i] = Float.parseFloat(scanner.nextLine());
            System.out.println("");
            
        }

        float sum = 0;
        for (float diem : diems) {
            sum += diem;
        }
        System.out.printf("Điểm TB %.2f", (sum/diems.length));
    }
}
