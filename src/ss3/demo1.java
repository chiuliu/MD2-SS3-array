package ss3;

public class demo1 {
    public static void main(String[] args) {
        // khai báo mảng 1 chiều
        int[] numbers = new int[5];
        System.out.println(numbers.length);
        String[] nyc = {"Hương", "Ngọc", "Lan", "Linh", "Trang"};
        System.out.println("so phan tu cua mang nyc "+ nyc.length);
        nyc[4] = "Đạt 09";


        // truy cập vào phần tử mảng
        System.out.println("Người yêu cũ thứ 3 " + nyc[2]);
        System.out.println("Người yêu cũ của QA là : " + nyc[4]);

        // dùng vòng lặp để duyệt qua mảng;
        System.out.println("Danh sách người yêu cũ");
        for (int i = 0; i < nyc.length ; i++) {
            System.out.println(nyc[i]);

        }
    }
}
