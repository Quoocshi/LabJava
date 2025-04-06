import java.util.Date;

public class kinhDoanh extends user {
    public kinhDoanh(String maKH, String tenKH, Date ngayHoaDon, double soLuongDien, double donGia) {
        super(maKH, tenKH, ngayHoaDon, soLuongDien, donGia);
    }

    @Override
    public double thanhTien() {
        if (soLuongDien > 400) {
            return (soLuongDien - 400) * donGia * 1.05;
        }
        return soLuongDien * donGia;
    }
}
