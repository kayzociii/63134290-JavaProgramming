/**
 * 
 */
package Lab3;
import java.util.Scanner;
/**
 * 
 */
public class Lab3Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int N = scanner.nextInt();

        boolean ok = true; 
        
        if (N <= 1) {
            ok = false;
        }

        for (int i = 2; i < N-1; i++) {
            if (N % i == 0) {
                ok = false;
                break;
            }
        }

        if (ok) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không phải là số nguyên tố.");
        }
	}


}
