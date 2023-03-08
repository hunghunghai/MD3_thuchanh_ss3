package demSinhVienThiDo;

import java.util.Scanner;

public class demSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Kích thước k vượt quá 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập sinh viên đánh dấu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sách sinh viên đánh dấu: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số lược sinh viên vượt qua kỳ thi là " + count);
    }
}
