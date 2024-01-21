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
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào độ dài cạnh: ");
		double canh = scanner.nextDouble();	
		
		double theTich = canh * canh * canh;
		
		System.out.printf("Thể tích khối lập phương là: %f" , theTich);
	}
}
