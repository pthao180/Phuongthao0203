package com.thaolnp2005110003.kiemtracuoiki;

import java.util.Date;
import java.util.Scanner;

public class Main {

	static Scanner bienNhap = new Scanner(System.in);
	public static Khohang kho = new Khohang();

	public static void main(String[] args) {

		while (true) {
			System.out.println();
			System.out.println("=============MENU=============");
			System.out.println("1=>  Them san pham		      ");
			System.out.println("2=>  In thong tin san pham    ");
			System.out.println("3=>  Xoa san pham             ");
			System.out.println("4=>  Tim san pham   		  ");
			System.out.println("5=>  Thong ke san pham        ");
			System.out.println("6=>  Thoat                    ");
			System.out.print("Vui long chon lai chuong trinh: ");
			int key = bienNhap.nextInt();

			switch (key) {
				case 1:
					Themhang(kho);
					break;
				case 2:
					Inthongtin(kho);
					break;
				case 3:
					XoaHang(kho);
					break;
				case 4:
					TimHang(kho);
					break;
				case 5:
					ThongKeKho(kho);
					break;
				default:
					break;
			}
		}
	}

	public static void Themhang(Khohang kho) {
		kho.Themhang(bienNhap);
	}

	public static void Inthongtin(Khohang kho) {
		kho.inthongtin(bienNhap);
	}

	public static void XoaHang(Khohang kho) {
		kho.XoaHang(bienNhap);
	}

	public static void TimHang(Khohang kho) {
		kho.TimHang(bienNhap);
	}

	public static void ThongKeKho(Khohang kho) {
		kho.ThongKe(bienNhap);
	}
}