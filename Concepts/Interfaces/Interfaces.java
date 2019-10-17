interface Shapes {
    String getName();
    double getArea();
    String getAreaFormula();
    int getNoOfSides();
}

interface Angles {
    boolean isRightAngled();
    boolean isAcute();
    boolean isObtuse();
}
class Triangle implements Shapes, Angles {
    double base, height;
    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }
    public String getName() {
        return "Triangle";
    }
    public double getArea() {
        return 0.5 * this.base * this.height;
    }
    public String getAreaFormula() {
        return "1/2 * base * height";
    }
    public int getNoOfSides() {
        return 3;
    }
    public boolean isRightAngled() {
        return true;
    }
    public boolean isAcute() {
        return true;
    }
    public boolean isObtuse() {
        return true;
    }
}

final class Interfaces {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4.0,5.0);
        System.out.println(triangle.getArea());
    }
}