package Figure;

public abstract class Quadrilateral extends Figure {

    private int sideA;
    private int sideB;
    private int area;
    private int perimeter;


    @Override
    public double calculateArea() {
        area = sideA * sideB;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = (sideA + sideB) * 2;
        return perimeter;
    }
}
