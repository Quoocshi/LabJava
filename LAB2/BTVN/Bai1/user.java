import java.util.Date;

public abstract class user {
    protected String maKH;
    protected String tenKH;
    protected Date ngayHoaDon;
    protected double soLuongDien;
    protected double donGia;

    public user() {
    }

    public user(String maKH, String tenKH, Date ngayHoaDon, double soLuongDien, double donGia) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngayHoaDon = ngayHoaDon;
        this.soLuongDien = soLuongDien;
        this.donGia = donGia;
    }

    public abstract double thanhTien();

    public void xuatHoaDon() {
        System.out.printf("%s  |  %s  |  %3f  |  %3f", maKH, tenKH, soLuongDien, thanhTien());
    }
}
