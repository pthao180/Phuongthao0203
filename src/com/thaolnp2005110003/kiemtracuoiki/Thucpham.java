package com.thaolnp2005110003.kiemtracuoiki;

import java.util.Date;
import java.util.Scanner;

public class Thucpham {
	int maHang;
	String tenSanpham;
	float giaTri;
	Date ngayNhapKho;

	Thucpham next;

	Thucpham() {

	}

	Thucpham(int _id, String _ten, float _gia, Date _ngayNhapKho) {
		maHang = _id;
		tenSanpham = _ten;
		giaTri = _gia;
		ngayNhapKho = _ngayNhapKho;
	}

	public void NhapTT(Scanner scanner) {

		scanner.nextLine();
		System.out.print("Nhap ten san pham: ");
		tenSanpham = scanner.nextLine();

		System.out.print("Hay nhap gia tri san pham: ");
		giaTri = scanner.nextFloat();

		ngayNhapKho = new Date();
	}

	public void inTT() {
		System.out.println(
				"Ten : " + tenSanpham + ", Loai : Thuc pham, Id: " + maHang + ", Gia: " + giaTri + ", Ngay nhap: "
						+ ngayNhapKho);
	}

	public String GetName() {
		System.out.println(tenSanpham);
		return tenSanpham;
	}
}
