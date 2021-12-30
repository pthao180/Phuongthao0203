package com.thaolnp2005110003.kiemtracuoiki;

import java.util.Date;
import java.util.Scanner;

public class Main {

	static Scanner bienNhap = new Scanner(System.in);
	public static Khohang kho = new Khohang();

	public static void main(String[] args) {

		Date a = new Date();

		Sanhsu headSs = new Sanhsu(1, "1", 1, a);
		Thucpham headTp = new Thucpham(2, "2", 2, a);

		Sanhsu Ss1 = new Sanhsu(3, "3", 3, a);
		headSs.next = Ss1;
		Thucpham Tp1 = new Thucpham(4, "4", 4, a);
		headTp.next = Tp1;

		Sanhsu Ss2 = new Sanhsu(5, "5", 5, a);
		Ss1.next = Ss2;
		Thucpham Tp2 = new Thucpham(6, "6", 6, a);
		Tp1.next = Tp2;

		kho.headSanhsu = headSs;
		kho.headThucpham = headTp;

		while (true) {
			System.out.println();
			System.out.println("____________MENU____________");
			System.out.println("1)  Them san pham		");
			System.out.println("2)  In thong tin san pham	");
			System.out.println("3)  Xoa san pham    ");
			System.out.println("4)  Tim hang hoa   		");
			System.out.println("5)  Thong ke hang hoa    ");
			System.out.println("6)  Thoat  ");
			System.out.print("Vui long chon chuong trinh: ");
			int key = bienNhap.nextInt();

			switch (key) {
				case 1:
					ThemHang(kho);
					break;
				case 2:
					InThongTin(kho);
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

	public static void ThemHang(Khohang kho) {
		kho.ThemHang(bienNhap);
	}

	public static void InThongTin(Khohang kho) {
		kho.InTT();
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