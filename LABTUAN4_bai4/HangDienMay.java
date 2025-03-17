import java.util.Scanner;

class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;

    public HangDienMay() {
        super();
        this.thoiGianBaoHanh = 0;
        this.dienAp = 0;
        this.congSuat = 0;
    }
    public HangDienMay(String maHang, String tenHang, long donGia, int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }
    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    public int getDienAp() {
        return dienAp;
    }
    public int getCongSuat() {
        return congSuat;
    }
    public void nhap() {
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap ma hang: ");
        String maHang = kb.nextLine();
        System.out.print("nhap ten hang: ");
        String tenHang = kb.nextLine();
        System.out.print("nhap don gia: ");
        long donGia = kb.nextLong();
        System.out.print("nhap thoi gian bao hanh(thang): ");
        thoiGianBaoHanh = kb.nextInt();
        System.out.print("nhap dien ap(V): ");
        dienAp = kb.nextInt();
        System.out.print("nhap cong suat(W): ");
        congSuat = kb.nextInt();

        super.setMaHang(maHang);
        super.setTenHang(tenHang);
        super.setDonGia(donGia);
    }
    public void xuat() {
        super.xuat();
        System.out.println("thoi gian bao hanh: " + thoiGianBaoHanh + "thang");
        System.out.println("dien ap: " + dienAp + "V");
        System.out.println("cong suat: " + congSuat + "W");
    }
}
