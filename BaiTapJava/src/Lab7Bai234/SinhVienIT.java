package Lab7Bai234;

public class SinhVienIT extends SinhVienPoly {
    private double java;
    private double html;
    private double css;

    public SinhVienIT(String hoTen, String nganh, double java, double html, double css) {
        super(hoTen, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getDiem() {
        return (2 * java + html + css) / 4;
    }
}
