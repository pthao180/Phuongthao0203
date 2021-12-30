package com.thaolnp2005110003.kiemtracuoiki;

import java.util.Date;
import java.util.Scanner;

public class Sanhsu {
	int ma;
	String ten;
	float gia;
	Date ngayNhapKho;

	Sanhsu next;

	Sanhsu() {

	}

	Sanhsu(int _id, String _ten, float _gia, Date _ngayNhapKho) {
		ma = _id;
		ten = _ten;
		gia = _gia;
		ngayNhapKho = _ngayNhapKho;
	}

	public void NhapTT(Scanner scanner) {

		scanner.nextLine();
		System.out.print("Nhap ten san pham: ");
		ten = scanner.nextLine();

		System.out.print("Hay nhap gia san pham: ");
		gia = scanner.nextFloat();

		ngayNhapKho = new Date();
	}

	public void inTT() {
		System.out.println(
				"Ten : " + ten + ", Loai : Sanh su, Id: " + ma + ", Gia: " + gia + ", Ngay nhap: " + ngayNhapKho);
	}

	public String GetName() {
		System.out.println(ten);
		return ten;
	}

}