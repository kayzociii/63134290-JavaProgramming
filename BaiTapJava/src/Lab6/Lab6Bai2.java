package Lab6;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab6Bai2 {
	
	static class SanPham{
		String tenSp, hang;
		Double donGia;
		
		
		public SanPham(String tenSp, Double donGia, String hang) {
			this.tenSp = tenSp;
			this.donGia = donGia;
			this.hang = hang;
		}
		
		public String getTenSp() {
		    return tenSp;
		}

		public double getDonGia() {
		    return donGia;
		}

		public String getHang() {
		    return hang;
		}
	}
	public static void main(String[] args) {
		ArrayList<SanPham> ds = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		nhap(ds, scanner);
		System.out.println("Danh sách sản phẩm Nokia: ");
        for(SanPham sp : ds) {
        	if(sp.getHang().matches("Nokia")) {
        		xuat(sp);
        	}
        }
	}
	
	public static void nhap(ArrayList<SanPham> ds, Scanner scanner) {
		System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sản phẩm thứ " + (i + 1) + ": ");
            String tenSp = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm thứ " + (i + 1) + ": ");
            Double donGia = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nhập hãng sản phẩm thứ " + (i + 1) + ": ");
            String hang = scanner.nextLine();
            
            
            SanPham sp = new SanPham(tenSp, donGia, hang);
            ds.add(sp);
        }
	}
	
	public static void xuat(SanPham sp) {
		System.out.println("Tên SP: " + sp.getTenSp());
		System.out.println("Giá SP: " + sp.getDonGia());
		System.out.println("Hãng: " + sp.getHang());
		System.out.println();
	}

}
