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
		GiaiPTBac1();
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
}


