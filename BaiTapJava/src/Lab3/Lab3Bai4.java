/**
 * 
 */
package Lab3;
import java.util.Scanner;
/**
 * 
 */
public class Lab3Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        
        String[] hoTen = new String[n];
        double[] diem = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            scanner.nextLine();  
            hoTen[i] = scanner.nextLine();

            System.out.print("Điểm: ");
            diem[i] = scanner.nextDouble();
        }

        
        System.out.println("\nThông tin sinh viên và học lực:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println();
        }

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (diem[j] > diem[j + 1]) {
                    double tempDiem = diem[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = tempDiem;

                    String tempHoTen = hoTen[j];
                    hoTen[j] = hoTen[j + 1];
                    hoTen[j + 1] = tempHoTen;
                }
            }
        }

        
        System.out.println("\nDanh sách sinh viên đã sắp xếp tăng dần theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": " + hoTen[i] + ", Điểm: " + diem[i]);
        }
    }


}
