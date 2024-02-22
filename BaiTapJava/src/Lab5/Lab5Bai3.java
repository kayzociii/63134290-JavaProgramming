package Lab5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Lab5Bai3 {
	
	static class SanPham{
		String ten;
		Float gia;
		
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
		sapxep(ds);
		xoa(ds, scanner);
		giatrungbinh(ds);
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
	
	public static void sapxep(ArrayList<SanPham> ds) {
		Comparator<SanPham> comp = new Comparator<SanPham>() {
			@Override
			public int compare(SanPham s1, SanPham s2) {
				return s1.gia.compareTo(s2.gia);
			}
		};
		Collections.sort(ds, comp);
		Collections.reverse(ds);
		xuat(ds);
	}
	
	public static void xoa(ArrayList<SanPham> ds, Scanner scanner) {
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String xoaSP = scanner.next();
        
        for (int i = 0; i < ds.size(); i++) {
        	SanPham sp = ds.get(i);
            if (sp.ten.equals(xoaSP)) {
                ds.remove(i);
                break;
            }
        }
        xuat(ds);
    }
	
	public static void giatrungbinh(ArrayList<SanPham> ds) {
		float tong = 0;
		for(SanPham sp : ds) {
			tong += sp.gia;
		}
		
		float giatrungbinh = tong / ds.size();
		System.out.println("Tổng giá TB của các sản phẩm là: " + giatrungbinh);
	}
}
