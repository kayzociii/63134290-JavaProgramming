/**
 * 
 */
package Lab4;
import java.util.Scanner;
/**
 * 
 */
class SanPham {
	public String tenSp; 
	public double donGia;
	public double giamGia;
	
	public SanPham() {
		
	}
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public double getThueNhapKhau() {
		return 0.1 * donGia;
	}
	
	public void xuat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tên sản phẩm: " + tenSp);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia);
		System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào tên sản phẩm: ");
		tenSp = scanner.next();
		System.out.print("Nhập vào đơn giá: ");
		donGia = scanner.nextDouble();
		System.out.print("Nhập vào giảm giá: ");
		giamGia = scanner.nextDouble();	
	}
}
public class Lab4 {
	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
		System.out.println("Nhập vào thông tin sản phẩm 1: ");
		sp1.nhap();
		System.out.println("Nhập vào thông tin sản phẩm 2: ");
		sp2.nhap();
		System.out.println("Sản phẩm 1: ");
		sp1.xuat();
		System.out.println("Sản phẩm 2: ");
		sp2.xuat();
	}
}

