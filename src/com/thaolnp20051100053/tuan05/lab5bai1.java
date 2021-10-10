package com.thaolnp20051100053.tuan05;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class lab5bai1 {
    public static void main(String[] args) {
        ArrayList<Double> soThuc = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Double x = scanner.nextDouble();
            soThuc.add(x);
            System.out.println("Nhập thêm Y/N ? ");
            scanner.nextLine();
            if (scanner.nextLine().equals("n"))
                break;
        }
        double tong = 0;
        for (Double x : soThuc) {
            System.out.print(x + " ");
            tong = tong + x;
        }
        System.out.println("\n Tổng = " + tong);
        scanner.close();
    }
}