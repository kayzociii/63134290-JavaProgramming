package Lab5;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab5Bai2 {

	public static void main(String[] args) {
		ArrayList<String> ds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        menu(ds, scanner);

	}
	
	public static void menu(ArrayList<String> ds, Scanner scanner) {
		nhap(ds, scanner);
		xuat(ds);
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
        System.out.println("Danh sách họ tên:");
        for (String hoTen : ds) {
            System.out.println(hoTen);
        }
    }

}
