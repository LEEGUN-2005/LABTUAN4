class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("xanh", false);
        System.out.println(shape);

        Circle circle = new Circle(2.0, "xanh la", true);
        System.out.println(circle);
        System.out.println("dien tich hinh tron: " + circle.getArea());
        System.out.println("Chu vi hinh tron: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "vang", false);
        System.out.println(rectangle);
        System.out.println("dien tich hcn: " + rectangle.getArea());
        System.out.println("chu vi hcn: " + rectangle.getPerimeter());

        Square square = new Square(2.5, "mau tim", true);
        System.out.println(square);
        System.out.println("dien tich hinh vuong: " + square.getArea());
        System.out.println("chu vi hinh vuong: " + square.getPerimeter());
    }
}
