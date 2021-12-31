package tieuLuanCuoiKi;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    static Kho khoHang;
  static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    nhapHangHoaMau(20);
    hienthiMenu();
  }

  private static void hienthiMenu() {
    System.out.println("\n=========\nChuong trinh Quan ly kho cua sieu thi cua NGUYEN VU ANH TOAN\n=========");
    int luaChon = 0;
    do {
      System.out.println("\nVui long chon (1 --> 7):");
      System.out.println("1. Them hang hoa");
      System.out.println("2. Xoa hang hoa");
      System.out.println("3. Sua hang hoa");
      System.out.println("4. Tim kiem hang hoa");
      System.out.println("5. Sap xep hang hoa");
      System.out.println("6. Thong ke hang hoa");
      System.out.println("7. Thoat khoi chuong trinh");
      System.out.print("Moi ban chon (1 --> 7): ");
      luaChon = scanner.nextInt();
      switch(luaChon) {
        case 1:
          inLuaChon("Them hang hoa");
          themHangHoa();
          break;
        case 2:
          inLuaChon("Xoa hang hoa");
          xoaHangHoa();
          break;
        case 3:
          inLuaChon("Sua hang hoa");
          suaHangHoa();
          break;
        case 4:
          inLuaChon("Tim kiem hang hoa");
          timKiemHangHoa();
          break;
        case 5:
          inLuaChon("Sap xep hang hoa");
          sapXepHangHoa();
          break;
        case 6:
          inLuaChon("Thong ke hang hoa");
          khoHang.inThongKe();
          break;
        case 7:
          System.out.println("ε[-_•]з Cam on ban 1a su dung chuong trinh! Tam biet! ε[-_•]з");
          break;
        default:
          System.out.println("Chuc nang ban chon khong hop le!");
      }
    } while (luaChon != 7);
  }

  private static void timKiemHangHoa() {
    int luaChon = 0;
    do {
      System.out.println("\nVui long chon (1 --> 6):");
      System.out.println("1. Tim kiem theo loai");
      System.out.println("2. Tim kiem theo gia chinh xac");
      System.out.println("3. Tim kiem theo khoang gia");
      System.out.println("4. Tim kiem theo ngay nhap kho chinh xac");
      System.out.println("5. Tim kiem theo khoang ngay nhap kho");
      System.out.println("6. Thoat khoi chuc nang tim kiem");
      System.out.print("Moi ban chon (1 --> 6): ");
      luaChon = scanner.nextInt();
      switch(luaChon) {
        case 1:
          inLuaChon("Tim kiem theo loai");
          timTheoLoai();
          break;
        case 2:
          inLuaChon("Tim kiem theo gia chinh xac");
          timChinhXacTheoGia();
          break;
        case 3:
          inLuaChon("Tim kiem theo khoang gia");
          timTheoKhoangGia();
          break;
        case 4:
          inLuaChon("Tim kiem theo ngay nhap kho chinh xac");
          timTheoNgayNhapKho();
          break;
        case 5:
          inLuaChon("Tim kiem theo khoang ngay nhap kho");
          timTheoKhoangThoiGianNhapKho();
          break;
        case 6:
          System.out.println("Dang quay ve menu chinh ...");
          break;
        default:
          System.out.println("Chuc nang ban chon khong hop le!");
      }
    } while (luaChon != 6);
  }

  private static void timTheoKhoangThoiGianNhapKho() {
    System.out.print("Vui long nhap ngay bat dau (yyyy-mm-dd), vd: 2021-12-31: ");
    LocalDate batDau = LocalDate.parse(scanner.next());
    System.out.print("Vui long nhap ngay ket thuc (yyyy-mm-dd), vd: 2021-12-31: ");
    LocalDate ketThuc = LocalDate.parse(scanner.next());
    khoHang.timTheoNgayNhapKho(batDau, ketThuc);
  }

  private static void timTheoNgayNhapKho() {
    System.out.print("Vui long nhap ngay nhap kho (yyyy-mm-dd), vd: 2021-12-31: ");
    LocalDate ngayNhap = LocalDate.parse(scanner.next());
    khoHang.timTheoNgayNhapKho(ngayNhap, ngayNhap);
  }

  private static void timChinhXacTheoGia() {
    System.out.print("Vui long nhap gia: ");
    int gia = scanner.nextInt();
    khoHang.timTheoGia(gia, gia);
  }

  private static void timTheoKhoangGia() {
    System.out.print("Vui long nhap gia thap nhat: ");
    int giaThap = scanner.nextInt();
    System.out.print("Vui long nhap gia cao nhat: ");
    int giaCao = scanner.nextInt();
    khoHang.timTheoGia(giaThap, giaCao);
  }

  private static void timTheoLoai() {
    scanner.nextLine();
    System.out.print("Vui long nhap loai hang hoa: ");
    String loai = scanner.nextLine();
    khoHang.timTheoLoai(loai);
  }

  private static void sapXepHangHoa() {
    int luaChon = 0;
    do {
      System.out.println("\nVui long chon (1 --> 9):");
      System.out.println("1. Sap xep theo gia nhap tang dan");
      System.out.println("2. Sap xep theo gia nhap giam dan");
      System.out.println("3. Sap xep theo ngay nhap tang dan");
      System.out.println("4. Sap xep theo ngay nhap giam dan");
      System.out.println("5. Sap xep theo loai va ngay nhap tang dan");
      System.out.println("6. Sap xep theo loai va ngay nhap giam dan");
      System.out.println("7. Sap xep theo loai va theo gia tang dan");
      System.out.println("8. Sap xep theo loai va theo gia giam dan");
      System.out.println("9. Thoat khoi chuc nang sap xep");
      System.out.print("Moi ban chon (1 --> 9): ");
      luaChon = scanner.nextInt();
      switch(luaChon) {
        case 1:
          inLuaChon("Sap xep theo gia nhap tang dan");
          khoHang.sapXepTheoGiaNhap(false);
          break;
        case 2:
          inLuaChon("Sap xep theo gia nhap giam dan");
          khoHang.sapXepTheoGiaNhap(true);
          break;
        case 3:
          inLuaChon("Sap xep theo ngay nhap tang dan");
          khoHang.sapXepTheoNgayNhap(false);
          break;
        case 4:
          inLuaChon("Sap xep theo ngay nhap giam dan");
          khoHang.sapXepTheoNgayNhap(true);
          break;
        case 5:
          inLuaChon("Sap xep theo loai va ngay nhap tang dan");
          khoHang.sapXepTheoLoaiVaNgayNhap(false);
          break;
        case 6:
          inLuaChon("Sap xep theo loai va ngay nhap giam dan");
          khoHang.sapXepTheoLoaiVaNgayNhap(true);
          break;
        case 7:
          inLuaChon("Sap xep theo loai va gia nhap tang dan");
          khoHang.sapXepTheoLoaiVaGiaNhap(false);
          break;
        case 8:
          inLuaChon("Sap xep theo loai va gia nhap giam dan");
          khoHang.sapXepTheoLoaiVaGiaNhap(true);
          break;
        case 9:
          System.out.println("Dang quay ve menu chinh ...");
          break;
        default:
          System.out.println("Chuc nang ban chon khong hop le!");
      }
    } while (luaChon != 9);
  }

  private static void themHangHoa() {
    scanner.nextLine();
    String maHang;
    HangHoa hangHoa;
    do {
      System.out.print("Vui long nhap ma hang hoa: ");
      maHang = scanner.nextLine();
      hangHoa = khoHang.timTheoMaHang(maHang);
      if (hangHoa != null) {
        System.out.println("Ma hang " + maHang + " da ton tai trong kho!\n");
      }
    } while (hangHoa != null && maHang != "");
    
    System.out.print("Vui long nhap loai hang hoa: ");
    String loai = scanner.nextLine();
    System.out.print("Vui long nhap ten hang hoa: ");
    String tenHang = scanner.nextLine();
    System.out.print("Vui long nhap gia nhap: ");
    int giaNhap = scanner.nextInt();
    System.out.print("Vui long nhap so luong: ");
    int soLuong = scanner.nextInt();
    System.out.print("Vui long nhap ngay nhap kho (yyyy-mm-dd), vd: 2021-12-31: ");
    LocalDate ngayNhap = LocalDate.parse(scanner.next());

    hangHoa = new HangHoa(loai, maHang, tenHang, giaNhap, soLuong, ngayNhap);
    khoHang.themHangHoa(hangHoa);
  }

  private static String nhapVaTimTheoMaHangHoa() {
    scanner.nextLine();
    System.out.print("Vui long nhap ma hang hoa: ");
    String maHang = scanner.nextLine();
    HangHoa hangHoa = khoHang.timTheoMaHang(maHang);
    if (hangHoa == null) {
      System.out.println("Khong tim thay ma hang: " + maHang);
      return null;
    }
    return maHang;
  }

  private static void xoaHangHoa() {
    String maHang = nhapVaTimTheoMaHangHoa();
    if (maHang == null) {
      return;
    }
    khoHang.xoaHangHoa(maHang);
  }

  private static void suaHangHoa() {
    String maHang = nhapVaTimTheoMaHangHoa();
    if (maHang == null) {
      return;
    }

    System.out.print("Vui long nhap loai hang hoa: ");
    String loai = scanner.nextLine();
    System.out.print("Vui long nhap ten hang hoa: ");
    String tenHang = scanner.nextLine();
    System.out.print("Vui long nhap gia nhap: ");
    int giaNhap = scanner.nextInt();
    System.out.print("Vui long nhap so luong: ");
    int soLuong = scanner.nextInt();
    khoHang.suaHangHoa(loai, maHang, tenHang, giaNhap, soLuong);
  }

  private static void inLuaChon(String chucNang) {
    System.out.println("\nBan da chon chuc nang: [" + chucNang + "]");
  }

 
  private static void nhapHangHoaMau(int soLuongCanNhap) {
    khoHang = new Kho();
    System.out.println("--- Dang nhap hang hoa mau ...");
    int giaNhoNhat = 100;
    int giaLonNhat = 5000;
    int soLuongNhoNhat = 1;
    int soLuongLonNhat = 100;
    LocalDate ngayNhoNhat = LocalDate.of(2021, 12, 1);
    LocalDate ngayLonNhat = LocalDate.now();
    String[] dsLoai = {"Thuc pham", "Sanh su", "Đien may"};
    String[] dsMaLoai = {"TP", "SS", "DM"};
    for (int i = 0; i < soLuongCanNhap; i++) {
      int chiSoLoai = new Random().nextInt(dsLoai.length);
      String loai = dsLoai[chiSoLoai];
      String maHang = dsMaLoai[chiSoLoai] + (i + 1);
      String tenHang = loai + " " + (i + 1);
      int giaNhap = (new Random().nextInt(giaLonNhat - giaNhoNhat) + giaNhoNhat) * 1000;
      int soLuong = new Random().nextInt(soLuongLonNhat - soLuongNhoNhat) + soLuongNhoNhat;
      long randomEpochDay = ThreadLocalRandom.current().nextLong(ngayNhoNhat.toEpochDay(), ngayLonNhat.toEpochDay());
      HangHoa hangHoa = new HangHoa(loai, maHang, tenHang, giaNhap, soLuong, LocalDate.ofEpochDay(randomEpochDay));
      khoHang.themHangHoa(hangHoa);
      System.out.print("- Đa them hang hoa thu " + (i + 1) + " vao kho hang (");
      hangHoa.inThongTin();
      System.out.print(")!\n");
    }
    System.out.println("--- Đa nhap xong hang hoa mau!");
  }
}
