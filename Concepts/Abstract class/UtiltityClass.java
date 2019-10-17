abstract class shape{
    String name;
    shape(String name){
        this.name = name;
    }
    public String definition(){
        return " i  belong to a shape, In inheriting a class shape";

    }
    abstract String getAreaFormula();
    abstract double getArea();
    abstract int getNoOfSides();
}

class Square extends shape{
    double side = 2.0;
    String name;
    // Square(final double s,final String n){
    //     super(n);
    //     this.side = s;
    // }
    
    Square () {
        super();
    }

    Square (final double s) {
        super();
        this.side = s;
    }
    Square (final double s,final String n) {
        this.name = n;
        this.side = s;
    }
    String getAreaFormula(){
        return "side * side";

    }
    double getArea(){
        return side * side;

    }
    int getNoOfSides(){
        return 4;

    } 

}
class Circle extends shape{
    double radius;
Circle(final double r,final String n){
        super(n);
        this.radius = r;

    }
    String getAreaFormula(){
        return "pi  r * r";

    }
    double getArea(){
        return 3.14 * radius * radius;

    }
    int getNoOfSides(){
        return 0;

    }

}
class Rectangle extends shape{
    double length;
    double breadth;
    Rectangle(final double len,final double br, final String n){
        super(n);
        this.length = len;
        this.breadth = br;
    }
    String getAreaFormula(){
        return "length * breadth";

    }
    double getArea(){
        return length * breadth;

    }
    int getNoOfSides(){
        return 4;

    }

}
final class UtilityClass {
    public static void main(String[] args){
        Square square = new Square(4.0,"square");
        System.out.println("My name is " + square.name);
        System.out.println("Area of square: " + square.getAreaFormula());
        System.out.println("Area: " + square.getArea());

        // Circle circle = new Circle(4,"Circle");
        // System.out.println("my name is " + circle.name);
        // System.out.println("Area of Circle: " + circle.getAreaFormula());
        // System.out.println("Area: " + circle.getArea());

        // Rectangle rect = new Rectangle(4,6,"Circle");
        // System.out.println("my name is " + rect.name);
        // System.out.println("Area of Circle: " + rect.getAreaFormula());
        // System.out.println("Area: " + rect.getArea());
    }
}