/**
 * 
 */
package Lab2;
import java.util.Scanner;
/**
 * 
 */
public class Lab2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//GiaiPTBac1();
		GiaiPTBac2();
        }
	
	//Lab2Bai1
	public static void GiaiPTBac1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }
	//Lab2Bai2
	public static void GiaiPTBac2() {
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
			else if (delta == 0) {
	            double x = -b / (2 * a);
	            System.out.println("Phương trình có nghiệm kép: x = " + x);
	        } else {
	            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	            System.out.println("Phương trình có hai nghiệm phân biệt:");
	            System.out.println("x1 = " + x1);
	            System.out.println("x2 = " + x2);
	        }
		}
	}
}


