package lab3tuan3;

import java.util.Arrays;
import java.util.Scanner;

public class lab3bai3 {
    public static void main(String[] args) {
        int[] soNguyen = new int[5]; // nhập mảng

        Scanner nhapMang = new Scanner(System.in);
        for (int i = 0; i < soNguyen.length; i++) {
            System.out.println("Số Thứ " + (i + 1));
            soNguyen[i] = nhapMang.nextInt();

        }
        // Xuất Mảng Vừa nhập
        System.out.println("Mảng Vừa Nhập");
        for (int i : soNguyen) {
            System.out.println("\t" + i);
        }
        // Xuất Mảng theo Thứ Tự Tăng Dần
        System.out.println("\nMảng Sau Khi Sắp xếp");
        Arrays.sort(soNguyen);
        for (int i : soNguyen) {
            System.out.println("\t" + i);
        }
        // Tìm giá trị nhỏ nhất
        int min = soNguyen[0];
        for (int i = 0; i < soNguyen.length; i++) {
            min = Math.min(min, soNguyen[i]);
        }
        System.out.println("\n Phần tử có giá trị nhỏ nhất:" + min);

        // Tính Trung bình cộng chia hết cho 3
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < soNguyen.length; i++) {
            if (soNguyen[i] % 3 == 0) {
                tong += soNguyen[i];
                dem++;
            }
        }
        System.out.println("\n Trung bình cộng chia hết cho 3:" + (tong / dem));
    }
}