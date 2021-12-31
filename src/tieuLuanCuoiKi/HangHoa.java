package tieuLuanCuoiKi;
import java.time.LocalDate;
public class HangHoa {
    String loai;
  String maHang;
  String tenHang;
  int giaNhap;
  int soLuong;
  LocalDate ngayNhap;

  public HangHoa(String loai, String maHang, String tenHang, int giaNhap, int soLuong, LocalDate ngayNhap) {
    this.loai = loai;
    this.maHang = maHang;
    this.tenHang = tenHang;
    this.giaNhap = giaNhap;
    this.soLuong = soLuong;
    this.ngayNhap = ngayNhap;
  }

  public void inThongTin() {
    System.out.print("Ma hang: " + maHang + "; Loai hang: " + loai + "; Ten hang: " + tenHang + "; Gia nhap: " + giaNhap + "; So luong: " + soLuong + "; Ngay nhap: " + ngayNhap);
  }
}
