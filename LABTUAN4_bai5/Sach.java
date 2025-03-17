class Sach {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected long gia;

    public Sach() {
        this.maSach = "";
        this.tenSach = "";
        this.tacGia = "";
        this.gia = 0;
    }

    public Sach(String maSach, String tenSach, String tacGia, long gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }
    public String getMaSach() {
        return maSach;
    }
    public String getTenSach() {
        return tenSach;
    }
    public String getTacGia() {
        return tacGia;
    }
    public long getGia() {
        return gia;
    }
    public long getGiaSauGiam() {
        return gia;
    }
    public void nhap() {
    }
    public void xuat() {
        System.out.println("ma sach: " + maSach + ", ten sach: " + tenSach + ", tac gia: " + tacGia + ", gia: " + gia);
    }
}
