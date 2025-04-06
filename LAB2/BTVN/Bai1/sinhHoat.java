import java.util.Date;

public class sinhHoat extends user {
    private double dinhMuc;

    public sinhHoat(String maKH, String tenKH, Date ngayHoaDon, double soLuongDien, double donGia, double dinhMuc) {
        super(maKH, tenKH, ngayHoaDon, soLuongDien, donGia);
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double thanhTien() {
        if (soLuongDien <= dinhMuc) {
            return soLuongDien * donGia;
        }
        return dinhMuc * donGia + (soLuongDien - dinhMuc) * donGia * 2;
    }
}
