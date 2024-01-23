/**
 * 
 */
package Lab2;
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		
		if (a == 0) {
			if (b == 0) {
	            if (c == 0) {
	                System.out.println("Phương trình vô số nghiệm");
	            } else {
	                System.out.println("Phương trình vô nghiệm");
	            }
	        } else {
	            double x = -c / b;
	            System.out.println("Nghiệm của phương trình là: x = " + x);
	        }
			
		}
		else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
	            System.out.println("Phương trình vô nghiệm");
			}
		}

	}
}
