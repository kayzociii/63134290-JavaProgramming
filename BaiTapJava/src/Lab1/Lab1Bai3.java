/**
 * 
 */
package Lab1;
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào độ dài cạnh: ");
		double canh = scanner.nextDouble();	
		
		double theTich = Math.pow(canh, 3);
		
		System.out.printf("Thể tích khối lập phương là: " + theTich);
	}
}
