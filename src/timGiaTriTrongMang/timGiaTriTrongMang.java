package timGiaTriTrongMang;

import java.util.Scanner;

public class timGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Hùng", "Hạnh", "Hưng", "Hải", "Hiếu", "Hoa", "Hậu", "Hoàn", "Hảo", "Hân", "Hoan"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của sinh viên trong danh sách " + input_name + " là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không có" + input_name + " trong danh sách.");
        }
    }
}
