package Lab5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Lab5Bai2 {

	public static void main(String[] args) {
		ArrayList<String> ds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        menu(ds, scanner);

	}
	
	public static void menu(ArrayList<String> ds, Scanner scanner) {
		nhap(ds, scanner);
		System.out.println("Danh sách họ tên:");
		xuat(ds);
		ngaunhien(ds);
		sapxep(ds);
		xoa(ds,scanner);
	}
	public static void nhap(ArrayList<String> ds, Scanner scanner) {
		System.out.print("Nhập số lượng họ tên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên thứ " + (i + 1) + ": ");
            String hoTen = scanner.nextLine();
            ds.add(hoTen);
        }
	}
	
	public static void xuat(ArrayList<String> ds) {
        for (String hoTen : ds) {
            System.out.println(hoTen);
        }
    }
	
	public static void ngaunhien(ArrayList<String> ds) {
        Collections.shuffle(ds);
        System.out.println("Danh sách họ tên ngẫu nhiên:");
        xuat(ds);
    }
	
	public static void sapxep(ArrayList<String> ds) {
		Collections.sort(ds);
		Collections.reverse(ds);
		System.out.println("Danh sách họ tên sau khi sắp xếp giảm dần:");
		xuat(ds);
	}
	
	private static void xoa(ArrayList<String> ds, Scanner scanner) {
        System.out.print("Nhập họ tên cần xóa: ");
        String xoaTen = scanner.next();
        
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).equals(xoaTen)) {
                ds.remove(i);
                break;
            }
        }
        System.out.println("Danh sách họ tên sau khi xóa:");
        xuat(ds);
    }
}
