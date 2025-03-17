import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        SachVanHoc vanHoc = new SachVanHoc("VH001", "Truyen Kieu", "Nguyen Du", 400000, 5);
     
        SachGiaoKhoa giaoKhoa = new SachGiaoKhoa("GK001", "Toan 10", "Hoang Xuan", 250000, 10, "Giao Duc");
        danhSachSach.add(vanHoc);
        danhSachSach.add(giaoKhoa);

        System.out.println("Nhap thong tin cho cac quyen sach:");
        for (Sach sach : danhSachSach) {
            sach.nhap();
        }
        System.out.println("\nthong tin cac quyen sach sau khi giam gia:");
        for (Sach sach : danhSachSach) {
            sach.xuat();
            System.out.println("Gia sau giam: " + sach.getGiaSauGiam());
        }
        Sach sachGiaMax = danhSachSach.get(0);
        for (Sach sach : danhSachSach) {
            if (sach.getGiaSauGiam() > sachGiaMax.getGiaSauGiam()) {
                sachGiaMax = sach;
            }
        }
        System.out.println("\nsach co gia lon nhat sau khi giam:");
        sachGiaMax.xuat();
        System.out.println("Gia sau giam: " + sachGiaMax.getGiaSauGiam());
    }
}
