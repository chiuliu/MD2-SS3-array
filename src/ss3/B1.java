package ss3;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Nhập vào phần tử cần xóa ");
        int delete = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delete) {
                index = i;
                flag = true;
                break;
            }

        }
        if (flag){
            for (int i = 0; i < arr.length -1 ; i++) {
                arr[i] = arr[i+1];

            }
            arr[arr.length-1] = 0;
            for (int i : arr){
                System.out.printf( "%d" , i);
            }
        }
        else {
            System.out.println("phần tử không tồn tại");
        }
    }
}
