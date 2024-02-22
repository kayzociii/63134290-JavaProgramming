package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6Bai3 {

	static class SinhVien{
		String hoTen;
	    String email;
	    String soDienThoai;
	    String cmnd;

	    public SinhVien(String hoTen, String email, String soDienThoai, String cmnd) {
	        this.hoTen = hoTen;
	        this.email = email;
	        this.soDienThoai = soDienThoai;
	        this.cmnd = cmnd;
	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getSoDienThoai() {
	        return soDienThoai;
	    }

	    public String getCmnd() {
	        return cmnd;
	    }
	}
	public static void main(String[] args) {
		ArrayList<SinhVien> ds = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		nhap(ds, scanner);
		System.out.println("Danh sách sinh viên: ");
        for(SinhVien sv : ds) {
        	String reEmail = "\\w+@\\w+\\.\\w+";
        	String rePhone = "0\\d{9,10}";
        	String reCMND = "[0-9]{9}";
        	
    		if(!sv.email.matches(reEmail)) {
    			System.out.println("Không đúng dạng email");
    		}
    		else if(!sv.soDienThoai.matches(rePhone)) {
    			System.out.println("Không đúng dạng số điện thoại");
    		}
    		else if(!sv.cmnd.matches(reCMND)) {
    			System.out.println("Không đúng dạng CMND");
    		}
    		else {
    			xuat(sv);
    		}
        }
	}
	
	public static void nhap(ArrayList<SinhVien> ds, Scanner scanner) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String soDienThoai = scanner.nextLine();
            System.out.print("CMND: ");
            String cmnd = scanner.nextLine();

            SinhVien sv = new SinhVien(hoTen, email, soDienThoai, cmnd);
            ds.add(sv);
        }
	}
	
	public static void xuat(SinhVien sv) {
		System.out.println("Tên sinh viên: " + sv.getHoTen());
		System.out.println("Email sinh viên: " + sv.getEmail());
		System.out.println("Số điện thoại sinh viên: " + sv.getSoDienThoai());
		System.out.println("CMND sinh viên: " + sv.getCmnd());
		System.out.println();
	}

}
