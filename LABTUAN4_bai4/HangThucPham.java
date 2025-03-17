import java.util.Scanner;
public class HangThucPham extends HangHoa {
    private String ngaySanXuat;
    private String ngayHetHan;

    public HangThucPham() {
        super();
        this.ngaySanXuat = "";
        this.ngayHetHan = "";
    }
    public HangThucPham(String maHang, String tenHang, long donGia, String ngaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }
    public String getNgaySanXuat() {
        return ngaySanXuat;
    }
    public String getNgayHetHan() {
        return ngayHetHan;
    }
    public void nhap() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        String maHang = kb.nextLine();
        System.out.print("Nhap ten hang: ");
        String tenHang =kb.nextLine();
        System.out.print("Nhap don gia: ");
        long donGia =kb.nextLong();
        kb.nextLine(); 
        System.out.print("Nhap ngay sx (dd/MM/yyyy): ");
        ngaySanXuat = kb.nextLine();
        System.out.print("Nhap ngay het han(dd/MM/yyyy): ");
        ngayHetHan = kb.nextLine();

        super.setMaHang(maHang);
        super.setTenHang(tenHang);
        super.setDonGia(donGia);
    }
    public void xuat() {
        super.xuat();
        System.out.println("ngay sx: " + ngaySanXuat);
        System.out.println("ngay het han: " + ngayHetHan);
    }
}
