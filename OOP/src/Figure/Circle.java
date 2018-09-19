package Figure;

public class Circle extends Figure {
    private int radius;
    private double area;
    private double perimeter;
    public Circle(){}
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return perimeter;
    }


    public double calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Радиус круга равен " +radius+" | Площадь круга равна "
                +calculateArea() + " | Периметр равен " +calculatePerimeter();
    }
}
