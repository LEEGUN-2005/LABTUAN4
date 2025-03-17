public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("ban kinh cua cirle: " + circle.getRadius());
        System.out.println("mau sac cua circle: " + circle.getColor());

        Cylinder cylinder = new Cylinder(5, 12);

        System.out.println(cylinder.toString());
        System.out.println("the tich cua cylinder: " + cylinder.getVolume());
    }
}
