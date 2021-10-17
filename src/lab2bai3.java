package tuan2;

import java.util.Scanner;

public class lab2bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện:");
        double soDien = scanner.nextDouble();
        if (soDien <= 50) {
            System.out.printf("số tiền phải trả là : %.2f", soDien * 1000);
        } else
            System.out.printf("số tiền phải trả là : %.2f", 50 * 1000 + (soDien - 50) * 1200);
    }
}