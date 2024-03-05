package Lab7Bai234;

public class SinhVienBiz extends SinhVienPoly {
    private double marketing;
    private double sales;

    public SinhVienBiz(String hoTen, String nganh, double marketing, double sales) {
        super(hoTen, nganh);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return (2 * marketing + sales) / 3;
    }
}
