package Figure;

public class Square extends Quadrilateral {
    private int side;
    private double area;
    private double perimeter;

    public Square(int side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        area = side * side;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 4 * side;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Сторона квадрата равна " + side + " | Площадь квадрата равна "
                + calculateArea() + " | Периметр равен " + calculatePerimeter();
    }
}
