/**
 * 
 */
package Lab1;
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào các hệ số của phương trình bậc 2");
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		
		double Delta = Math.pow(b,2) - 4*a*c;
		double canDelta = Math.sqrt(Delta);
		
		System.out.printf("Delta của phương trình bậc 2 là: " + Delta);
		System.out.println();
		System.out.printf("Căn delta của phương trình bậc 2 là: " + canDelta);
	}

}
