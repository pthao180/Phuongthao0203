package com.thaolnp2005110003.kiemtracuoiki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Khohang {
	Sanhsu headSanhsu;
	Thucpham headThucpham;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

	Khohang() {

	}

	Khohang(Sanhsu _headSanhsu, Thucpham _headThucpham) {
		headSanhsu = _headSanhsu;
		headThucpham = _headThucpham;
	}

	public void ThemHang(Scanner scanner) {
		System.out.println("Vui long chon loai hang ban muon ");
		System.out.print("1/ Sanh Su");
		System.out.print("2/ Thuc Pham");
		System.out.print(" Lua chon:");
		int loaihang = scanner.nextInt();
	}

	else if(loaihang==1)

	{
		Sanhsu cur = headSanhsu;
		while (cur != null) {
			if (cur.next == null) {
				Sanhsu itemMoi = new Sanhsu();
				itemMoi.ma = NhapId(scanner, loaihang);
				itemMoi.NhapTT(scanner);
				cur.next = itemMoi;
				break;
			}
			cur = cur.next;
		}
	}else if(loaihang==2)
	{
			Thucpham cur = headThucpham;
			while (cur != null) {
				if (cur.next == null) {
					Thucpham itemMoi = new Thucpham();
					itemMoi.ma = NhapId(scanner, loaihang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
			}
				cur = cur.next;
		}
	}
}

	int NhapId(Scanner scanner, int loaihang) {

		System.out.print("Hay nhap ID hang: ");
		int id = scanner.nextInt();

		if (loaihang == 1) {
			Sanhsu cur = headSanhsu;
			while (cur != null) {
				if (cur.ma == id) {
					System.out.print("Id nay da co mat trong kho");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}

		if (loaihang == 2) {
			Thucpham cur = headThucpham;
			while (cur != null) {
				if (cur.ma == id) {
					System.out.print("Id nay da co mat trong kho");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		return id;
	}

	public void InTT() {
		Sanhsu curSs = headSanhsu;
		Thucpham curTp = headThucpham;

		while (curSs != null) {
			curSs.inTT();
			curSs = curSs.next;
		}

		System.out.println();

		while (curTp != null) {
			curTp.inTT();
			curTp = curTp.next;
		}

	}

	public void XoaHang(Scanner scanner) {
		System.out.println("Muon xoa loai hang nao bang cach nao?");
		System.out.print("1/ theo id cua san pham");
		System.out.print("2/ theo ten san pham");
		System.out.print(" Lua chon:");
		int cachxoa = scanner.nextInt();

		if (cachxoa == 1) {
			System.out.print("Hay nhap Id san pham can xoa: ");
			int idCanXoa = scanner.nextInt();

			if (headSanhsu.ma == idCanXoa) {
				headSanhsu = headSanhsu.next;
				return;
			}

			if (headThucpham.ma == idCanXoa) {
				headThucpham = headThucpham.next;
				return;
			}

			Sanhsu curSs = headSanhsu;
			Thucpham curTp = headThucpham;

			while (curSs.next != null) {
				if (curSs.next.ma == idCanXoa) {
					curSs.next = curSs.next.next;
					return;
				}
				curSs = curSs.next;
			}

			while (curTp != null) {
				if (curTp.next.ma == idCanXoa) {
					curTp.next = curTp.next.next;
					return;
				}
				curTp = curTp.next;
			}
			System.out.println("Xoa thanh cong");
		}

		if (cachxoa == 2) {
			System.out.print("Hay nhap ten san pham can xoa: ");
			scanner.nextLine();
			String idCanXoa = scanner.nextLine();

			if (headSanhsu.ten.equalsIgnoreCase(idCanXoa)) {
				headSanhsu = headSanhsu.next;
				return;
			}

			if (headThucpham.ten.equalsIgnoreCase(idCanXoa)) {
				headThucpham = headThucpham.next;
				return;
			}

			Sanhsu curSs = headSanhsu;
			Thucpham curTp = headThucpham;

			while (curSs.next != null) {
				if (curSs.next.ten.equalsIgnoreCase(idCanXoa)) {
					curSs.next = curSs.next.next;
					return;
				}
				curSs = curSs.next;
			}

			while (curTp != null) {
				if (curTp.next.ten.equalsIgnoreCase(idCanXoa)) {
					curTp.next = curTp.next.next;
					return;
				}
				curTp = curTp.next;
			}
			System.out.println("Xoa Thanh Cong");
		}

		if (cachxoa == 3) {

		}

	}

	public void TimHang(Scanner scanner) {
		System.out.println("Ban Muon tim  theo cach nao");
		System.out.print("1/ theo loai");
        System.out.print("2/ theo gia");
        System.out.print("3/ theo ngay nhap hang ");	
        System.out.print(" Lua chon:");
		
		int cachtim = scanner.nextInt();
		
		
		if (cachtim == 1) {
		System.out.println("Vui long chon loai hang ma ban muon tim\n  ");
        System.out.print("1/ Sanh Su");	
        System.out.print("2/ Thuc Pham");
        System.out.print(" Lua chon:");
			int loai = scanner.nextInt();
			
			}else if (loai == 1) {
				Sanhsu cur = headSanhsu;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}else if (loai == 2) {
				Thucpham cur = headThucpham;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}
			
			
		}else if(cachtim==2)

	{
		System.out.print("Hay nhap  gia tri hang hoa ma ban muon tim\n Tu: ");
		float start = scanner.nextFloat();
		System.out.print("Den: ");
		float end = scanner.nextFloat();

		Sanhsu curSs = headSanhsu;
		Thucpham curTp = headThucpham;

		while (curSs != null) {
			if (curSs.gia >= start && curSs.gia <= end)
				curSs.inTT();
			curSs = curSs.next;
		}
		System.out.println();

		while (curTp != null) {
			if (curTp.gia >= start && curTp.gia <= end)
				curTp.inTT();
			curTp = curTp.next;
		}

	}else if(cachtim==3)
	{
		System.out.println("Hay nhap khoang ngay nhap muon tim (dd-mm-yyyy)\n Từ : ");
		String date = Scanner.next.Line();
		Date startDate;
		try {
			startDate = dateFormat.parse(date);
		} catch (ParseException e) {
			System.err.println("Nhap sai vui long nhap lai");
			return;
		}
	}

	public void ThongKe(Scanner scanner) 
	{
		int tongSLHang = 0;
		int tongSLSanhsu = 0;
		int tongSLThucpham = 0;
		
		float tongGiaTri = 0;
		float tongGiaTriSanhsu = 0;
		float tongGiaTriThucpham = 0;
		
		Sanhsu curSs = headSanhsu;
		Thucpham curTp = headThucpham;
		
		while (curSs != null) {
			tongSLSanhsu++;
			tongGiaTriSanhsu += curSs.gia;
			curSs = curSs.next;
		}
		
		while (curTp != null) {
			tongSLThucpham++;
			tongGiaTriThucpham += curTp.gia;
			curTp = curTp.next;
		}
		
		tongSLHang = tongSanhsu + tongSLThucpham;
		tongGiaTri = tongGiaTriSanhsu + tongGiaTriThucpham;
		
		System.out.println("Tong so luong hang hoa dang co o kho: " + tongSLHang + " san pham");
		System.out.println("Tong giá tien nhap kho: " + tongGiaTri + "dong\n");
		
		System.out.println("Sanh su : " + tongSLSanhsu + " san pham");
		System.out.println("Thuc pham : " + tongSLThucpham + " san pham");
	}
