import java.util.Scanner;
class SachVanHoc extends Sach {
    private int lanXuatBan;

    public SachVanHoc() {
        super();
        this.lanXuatBan = 0;
    }
    public SachVanHoc(String maSach, String tenSach, String tacGia, long gia, int lanXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lanXuatBan = lanXuatBan;
    }
    public int getLanXuatBan() {
        return lanXuatBan;
    }
    @Override
    public long getGiaSauGiam() {
        return (gia > 300000) ? (long) (gia * 0.8) : gia;
    }
    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = scanner.nextLine();
        System.out.print("Nhap gia: ");
        gia = scanner.nextLong();
        System.out.print("Nhap lan xuat ban: ");
        lanXuatBan = scanner.nextInt();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("lan xuat ban: " + lanXuatBan);
    }
}
