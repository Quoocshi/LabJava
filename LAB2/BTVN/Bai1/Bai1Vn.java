import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;

import sinhHoat;
import kinhDoanh;
import sanXuat;
import user;

public class Bai1Vn {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<user> dsKH = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        nhapKhachHang();
        xuatHoaDonTheoThangNam();
    }

    static void nhapKhachHang() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Map<String, Integer> loaiKhachHang = new HashMap<>();
        while (true) {
            System.out.print("\nNhap maKH (Enter de dung):");
            String ma = sc.nextLine().trim();
            if (ma.isEmpty())
                break;

            System.out.print("Ten KH: ");
            String ten = sc.nextLine().trim();

            String key = ma + ten;

            System.out.print("Ngay hoa don (dd/MM/yyyy): ");
            Date ngay = sdf.parse(sc.nextLine());

            System.out.print("So dien tieu thu: ");
            double sd = Double.parseDouble(sc.nextLine());

            System.out.print("Don gia: ");
            double dg = Double.parseDouble(sc.nextLine());

            System.out.print("Loai (1: Sinh hoat, 2: Kinh doanh, 3: San xuat): ");
            int loai = Integer.parseInt(sc.nextLine());

            if (loaiKhachHang.containsKey(key)) {
                int loaiDien = loaiKhachHang.get(key);
                if (loaiDien != loai) {
                    System.out.println("Khach hang " + ten + " co ma la " + ma + " hien dang su dung loai dien la "
                            + loai + " , khong the chuyen sang loai dien khac. Vui long nhap lai!");
                    continue;
                }
            } else {
                loaiKhachHang.put(key, loai);
            }
            switch (loai) {
                case 1:
                    System.out.print("Dinh muc: ");
                    double dm = Double.parseDouble(sc.nextLine());
                    dsKH.add(new sinhHoat(ma, ten, ngay, sd, dg, dm));
                    break;
                case 2:
                    dsKH.add(new kinhDoanh(ma, ten, ngay, sd, dg));
                    break;
                case 3:
                    System.out.print("Loai dien (2 - hai pha, 3 - ba pha): ");
                    int ld = Integer.parseInt(sc.nextLine());
                    dsKH.add(new sanXuat(ma, ten, ngay, sd, dg, ld));
                    break;
                default:
                    System.out.println("Loai khong hop le!");
            }
        }
    }

    static void xuatHoaDonTheoThangNam() {
        System.out.print("\nNhap thang can xuat hoa don (1-12): ");
        int thang = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap nam can xuat hoa don (vd: 2025): ");
        int nam = Integer.parseInt(sc.nextLine());

        System.out.println("\n--- HOA DON TIEN DIEN THANG " + thang + "/" + nam + " ---");
        System.out.printf("%-10s | %-20s | %10s | %15s\n",
                "Ma KH", "Ten KH", "So luong dien", "Thanh tien");
        System.out.println("---------------------------------------------------------------");

        boolean found = false;
        for (user kh : dsKH) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(kh.ngayHoaDon);
            int thangHD = cal.get(Calendar.MONTH) + 1;
            int namHD = cal.get(Calendar.YEAR);

            if (thangHD == thang && namHD == nam) {
                found = true;
                System.out.printf("%-10s | %-20s | %10.2f | %15.2f\n",
                        kh.maKH, kh.tenKH, kh.soLuongDien, kh.thanhTien());
            }
        }

        if (!found) {
            System.out.println("Khong co hoa don nao trong thang " + thang + "/" + nam + ".");
        }
    }

}
