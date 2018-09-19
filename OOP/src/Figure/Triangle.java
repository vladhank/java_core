package Figure;

public class Triangle extends Figure implements HeightTriangle, TypeOfTriangle {
    private int sideA;
    private int sideB;
    private int sideC;
    private double height;
    private double area;
    private double perimeter;
    private String type;
    private double p;


    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }

    public double calculateHeight() {
        p = (1d / 2) * (sideA + sideB + sideC);
        height = (2d * Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC))) / sideA;
        return height;
    }

    public String typeOfTriangle() {
        if (sideA == sideB && sideB == sideC) {
            type = "Равносторонний треуголник";
        }
        if (sideC == (Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)))) {
            type = " Прямоугольный треугольник";
        }
        return type;
    }

    @Override
    public double calculateArea() {
        calculateHeight();
        area = (1d / 2) * sideA * height;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Сторона А равна " + sideA + " | Сторона B равна " + sideB + " | Сторона C равна " + sideC + " | Площадь треугольника равна "
                + calculateArea() + " | Периметр равен " + calculatePerimeter() + " | Высота равна " + calculateHeight() + " | " + typeOfTriangle();
    }
}
