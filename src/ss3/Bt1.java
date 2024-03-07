package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,5,6,23,24,25,7,8,9};
        System.out.println("Nhập phần tử cần xóa ");
        int X = Integer.parseInt(scanner.nextLine());
        System.out.println("Mảng trước khi xóa :" + Arrays.toString(arr));
        int indexDel = -1;
        for( int i = 0; i < arr.length; i++){
            if ( X == arr[i]){
                arr[i] = arr[i + 1];
                System.out.println("Phần tử cần xóa ở vị trí index "+i );
                indexDel += i;
                arr[arr.length-1] = 0;
            }

            }
        if (indexDel != -1){
            System.out.println("Phần tử " +X+ "không có trong mảng");
        }
        else {
            System.out.println("Mảng sau khi xóa :" + Arrays.toString(arr));



        }



    }
}
