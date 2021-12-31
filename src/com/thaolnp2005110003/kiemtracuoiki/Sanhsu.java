package com.thaolnp2005110003.kiemtracuoiki;

import java.util.Date;
import java.util.Scanner;

public class Sanhsu {
	int maHang;
	String tenSanPham;
	float giaTri;
	Date ngayNhapKho;

	Sanhsu next;

	Sanhsu() {

	}

	Sanhsu(int _id, String _ten, float _gia, Date _ngayNhapKho) {
		maHang = _id;
		tenSanPham = _ten;
		giaTri = _gia;
		ngayNhapKho = _ngayNhapKho;
	}

	public void NhapTT(Scanner scanner) {

		scanner.nextLine();
		System.out.print("Nhap ten san pham: ");
		tenSanPham = scanner.nextLine();

		System.out.print("Hay nhap gia san pham: ");
		giaTri = scanner.nextFloat();

		ngayNhapKho = new Date();
	}

	public void inTT() {
		System.out.println(
				"Ten : " + tenSanPham + ", Loai : Sanh su, Id: " + maHang + ", Gia: " + giaTri + ", Ngay nhap: "
						+ ngayNhapKho);
	}

	public String GetName() {
		System.out.println(tenSanPham);
		return tenSanPham;
	}

}