public class Main {
    public static void main(String[] args) {
        HangDienMay dienMay = new HangDienMay("DM001", "Tivi", 5000000, 12, 220, 100);
        System.out.println("thong tin hang dien may:");
        dienMay.xuat();

        HangThucPham thucPham = new HangThucPham("TP001", "Gao", 20000, "01/03/2025", "01/09/2025");
        System.out.println("\nThong tin hang thuc pham:");
        thucPham.xuat();
    }
}
