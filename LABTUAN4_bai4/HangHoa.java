class HangHoa {
    private String maHang;
    private String tenHang;
    private long donGia;

    public HangHoa() {
        this.maHang = "";
        this.tenHang = "";
        this.donGia = 0;
    }

    public HangHoa(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    public String getMaHang() {
        return maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public long getDonGia() {
        return donGia;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    
    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
    

    public void xuat() {
        System.out.println("ma hang: " + maHang);
        System.out.println("ten hang: " + tenHang);
        System.out.println("don gia: " + donGia);
    }
}
