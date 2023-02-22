package Project2;

public interface Shape {
    /*
    1. Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.
     */
    void calculateArea();
    void  calculatePerimeter();

}
class Circle implements Shape{
    double radius;

    final double fi=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of this circle is "+(radius*radius)*fi);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of this circle is "+(2*fi)*radius);
    }
}
class Square implements Shape{
    double side ;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of Square is "+(side*side));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of this square is "+(side*4));
    }


    public static void main(String[] args) {
        Shape[] calculates = {new Circle(5), new Square(7)};
        for (Shape x : calculates) {
            x.calculateArea();
            x.calculatePerimeter();
        }
    }}

