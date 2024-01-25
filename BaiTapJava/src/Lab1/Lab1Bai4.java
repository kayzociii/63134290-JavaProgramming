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
		System.out.println("Delta của phương trình bậc 2 là: " + Delta);
		
		if(Delta < 0) {
			System.out.print("Không thể tính được căn delta vì delta < 0!");
		}
		else {
			double canDelta = Math.sqrt(Delta);
			System.out.printf("Căn delta của phương trình bậc 2 là: " + canDelta);
		}
			
	}

}
