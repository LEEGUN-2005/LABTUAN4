import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private int lop;
    private String nhaXuatBan;

    public SachGiaoKhoa() {
        super();
        this.lop = 0;
        this.nhaXuatBan = "";
    }
    public SachGiaoKhoa(String maSach, String tenSach, String tacGia, long gia, int lop, String nhaXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lop = lop;
        this.nhaXuatBan = nhaXuatBan;
    }
    public int getLop() {
        return lop;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    @Override
    public long getGiaSauGiam() {
        return nhaXuatBan.equals("giao duc") ? (long) (gia * 0.9) : gia;
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
        scanner.nextLine(); 
        System.out.print("Nhap lop: ");
        lop = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = scanner.nextLine();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Lop: " + lop + ", Nha xuat ban: " + nhaXuatBan);
    }
}
