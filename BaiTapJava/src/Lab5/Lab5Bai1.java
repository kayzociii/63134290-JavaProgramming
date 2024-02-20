package Lab5;
import java.util.Scanner;
import java.util.ArrayList;


public class Lab5Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
     
        ArrayList<Double> ds = new ArrayList<>();
        
        while(true){
        	Double x = scanner.nextDouble();
        	ds.add(x);
        	System.out.print("Nhập thêm (Y/N)?: ");
        	if(scanner.nextLine().equals("N")){
        	break;
        	}
        }
        
        System.out.println("Danh sách số thực vừa nhập:");
        for (double x : ds) {
            System.out.print(x + " ");
        }
        
        
        float tong = 0;
        for(int i = 0; i < ds.size(); i++) {
        	tong += ds.get(i);
        }
        
        System.out.println("Tổng của danh sách số thực là: " + tong);
	}

}
