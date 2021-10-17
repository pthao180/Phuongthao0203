package com.thaolnp2005110003.tuan3;

public class lab3bai2 {
    public static void main(String[] args) {
        System.out.println("Bảng cửu chương:");
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
                System.out.println();
            }
        }
    }
}
