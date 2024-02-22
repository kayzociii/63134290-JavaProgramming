package Lab6;
import java.util.Scanner;

public class Lab6Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào họ và tên: ");
		String hoten = scanner.nextLine();
		
		String ho = LayHo(hoten);
		String tendem = LayTenDem(hoten);
		String ten = LayTen(hoten);
		
		System.out.println("Họ: " + ho.toUpperCase());
		System.out.println("Tên đệm: " + tendem);
		System.out.println("Tên: " + ten.toUpperCase());
	}
	
	public static String LayHo(String hoten) {
		int index = hoten.indexOf(' ');
		if(index != -1) {
			return hoten.substring(0, index);
		}
		else {
			return hoten;
		}	
	}
	
	public static String LayTen(String hoten) {
		int index = hoten.lastIndexOf(' ');
		if(index != -1) {
			return hoten.substring(index + 1);
		}
		else {
			return hoten;
		}
	}
	
	public static String LayTenDem(String hoten) {
		int index = hoten.indexOf(' ');
		int index2 = hoten.lastIndexOf(' ');
		if(index != -1 && index2 != -1 && index < index2) {
			return hoten.substring(index + 1, index2);
		}
		else {
			return " ";
		}
	}
}
