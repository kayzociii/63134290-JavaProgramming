package Lab7Bai234;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Menu();
	}
	
    public static void Menu() {
        ArrayList<SinhVienPoly> danhSachSinhVien = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);
	    
        while (true) {
        	System.out.println("----- Quản lý sinh viên -----");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Chọn: ");
            
            int c = scanner.nextInt();

            switch (c) {
                case 1:
                    Nhap(danhSachSinhVien, scanner);
                    break;
                case 2:
                    Xuat(danhSachSinhVien);
                    break;
                case 3:
                    SVGioi(danhSachSinhVien);
                    break;
                case 4:
                    SapXep(danhSachSinhVien);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
	public static void Nhap(ArrayList<SinhVienPoly> danhSachSinhVien, Scanner scanner) {
        System.out.print("Nhập số lượng sinh viên: ");
        int soLuong = scanner.nextInt();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1));

            System.out.print("Nhập họ tên sinh viên: ");
            scanner.nextLine(); 
            String hoTen = scanner.nextLine();

            System.out.print("Nhập ngành học: ");
            String nganh = scanner.next();

            System.out.print("Loại sinh viên (IT/Biz): ");
            String loaiSV = scanner.next();

            if (loaiSV.equals("IT")) {
                System.out.print("Điểm Java: ");
                double java = scanner.nextDouble();
                System.out.print("Điểm HTML: ");
                double html = scanner.nextDouble();
                System.out.print("Điểm CSS: ");
                double css = scanner.nextDouble();

                danhSachSinhVien.add(new SinhVienIT(hoTen, nganh, java, html, css));
            } else if (loaiSV.equals("Biz")) {
                System.out.print("Điểm Marketing: ");
                double marketing = scanner.nextDouble();
                System.out.print("Điểm Sales: ");
                double sales = scanner.nextDouble();

                danhSachSinhVien.add(new SinhVienBiz(hoTen, nganh, marketing, sales));
            } else {
                System.out.println("Loại sinh viên không hợp lệ. Vui lòng nhập lại.");
                i--;
            }
        }
    }
	
	public static void Xuat(ArrayList<SinhVienPoly> danhSachSinhVien) {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (SinhVienPoly sv : danhSachSinhVien) {
                sv.xuat();
                System.out.println();
            }
        }
    }
	
	public static void SVGioi(ArrayList<SinhVienPoly> danhSachSinhVien) {
        boolean kiemtraSVGioi = false;

        for (SinhVienPoly sv : danhSachSinhVien) {
            if (sv.getHocLuc().equals("Giỏi")) {
                sv.xuat();
                System.out.println();
                kiemtraSVGioi = true;
            }
        }

        if (!kiemtraSVGioi) {
            System.out.println("Không có sinh viên nào có học lực giỏi.");
        }
    }
	
	public static void SapXep(ArrayList<SinhVienPoly> danhSachSinhVien) {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            Collections.sort(danhSachSinhVien, (sv1, sv2) -> {
                return Double.compare(sv2.getDiem(), sv1.getDiem());
            });

            System.out.println("Danh sách sau khi sắp xếp:");
            Xuat(danhSachSinhVien);
        }
    }
}
