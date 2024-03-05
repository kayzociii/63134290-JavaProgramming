package Lab8;

public class XPoly {
	public static final double sum(double... x) {
        double kq = 0;
        for (double num : x) {
            kq += num;
        }
        return kq;
    }
}
