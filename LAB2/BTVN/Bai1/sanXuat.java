import java.util.Date;

public class sanXuat extends user {
    int loaiDien;

    public sanXuat(String maKH, String tenKH, Date ngayHoaDon, double soLuongDien, double donGia,
            int loaiDien) {
        super(maKH, tenKH, ngayHoaDon, soLuongDien, donGia);
        this.loaiDien = loaiDien;
    }

    @Override
    public double thanhTien() {
        if (loaiDien == 2 && soLuongDien > 200)
            return soLuongDien * donGia * 0.98;
        if (loaiDien == 3 && soLuongDien > 150)
            return soLuongDien * donGia * 0.97;
        return soLuongDien * donGia;
    }
}
