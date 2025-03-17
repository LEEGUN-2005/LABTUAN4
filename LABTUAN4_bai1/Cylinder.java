class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super(); 
        this.height = 1.0;
    }
    public Cylinder(double radius) {
        super(); 
        this.height = 1.0;
    }
    public Cylinder(double radius, double height) {
        super(); 
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getRadius() * getRadius() * Math.PI * height;
    }
    @Override
    public String toString() {
        return "ban kinh cua cylinder = " + getRadius() + ",chieu cao = " + height + ", mau sac = " + getColor();
    }
}
