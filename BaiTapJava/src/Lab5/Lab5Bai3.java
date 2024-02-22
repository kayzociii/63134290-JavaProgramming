package Lab5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Lab5Bai3 {
	
	static class SanPham{
		String ten;
		float gia;
		
		public SanPham(String ten, float gia) {
			this.ten = ten;
			this.gia = gia;
		}
	}
	public static void main(String[] args) {
		ArrayList<SanPham> ds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        menu(ds, scanner);
	}
	
	public static void menu(ArrayList<SanPham> ds, Scanner scanner) {
		nhap(ds, scanner);
		xuat(ds);
	}
	
	public static void nhap(ArrayList<SanPham> ds, Scanner scanner) {
		System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sản phẩm thứ " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm thứ " + (i + 1) + ": ");
            float gia = scanner.nextFloat();
            scanner.nextLine();
            
            SanPham sp = new SanPham(ten, gia);
            ds.add(sp);
        }
	}
	
	public static void xuat(ArrayList<SanPham> ds) {
		System.out.println("DANH SÁCH SẢN PHẨM: ");
        for (SanPham sp : ds) {
            System.out.println("Tên sản phẩm: " + sp.ten);
            System.out.println("Giá sản phẩm: " + sp.gia);
        }
    }

}
