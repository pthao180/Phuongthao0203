package com.thaolnp2005110003.kiemtracuoiki;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Khohang {
    String loaiHang;
    int maHang;
    String tenSanpham;
    double giaNhapkho;
    int soLuongTonKho;
    Date ngayNhapKho = null;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
    Scanner scanner = new Scanner(System.in);

    public Khohang() {
    }

    public Khohang(String l, int m, String t, double g, int s, Date n) {
        loaiHang = l;
        maHang = m;
        tenSanpham = t;
        giaNhapkho = g;
        soLuongTonKho = s;
        ngayNhapKho = n;
    }

    public Khohang(String l, int m, String t, double g, int s, String ngay) {
        loaiHang = l;
        maHang = m;
        tenSanpham = t;
        giaNhapkho = g;
        soLuongTonKho = s;
        try {
            ngayNhapKho = simpleDateFormat.parse(ngay);

        } catch (Exception e) {
        }
        Date n = ngayNhapKho;
    }

    public void nhap() {
        System.out.println("====================");
        System.out.print("Loai: ");
        loaiHang = scanner.nextLine();
        System.out.print("Ma: ");
        maHang = scanner.nextInt();
        System.out.print("Ten: ");
        scanner.nextLine();
        tenSanpham = scanner.nextLine();
        System.out.print("Gia: ");
        giaNhapkho = scanner.nextDouble();
        System.out.print("So luong: ");
        soLuongTonKho = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ngay nhap: ");
        try {
            ngayNhapKho = simpleDateFormat.parse(scanner.nextLine());

        } catch (Exception e) {
        }
    }

    void inThongTin() {

        System.out.println("Loai: " + loaiHang + "\t" + "|| Ma : " + maHang + "\t" + "|| Ten: " + tenSanpham + "\t"
                + "|| Gia: " + giaNhapkho + "\t" + "|| So Luong: " + soLuongTonKho + "\t" + "|| Ngay nhap: "
                + simpleDateFormat.format(ngayNhapKho));
    }

}
