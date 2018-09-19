package Figure;

public class RightTriangle extends Triangle {
    private int sideA;
    private int sideB;
    private int sideC;
    private double height;
    private double area;
    private double perimeter;

    public RightTriangle(int sideA, int sideB, int sideC) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    @Override
    public double calculateHeight() {
        height = (sideA * sideB) / (sideC);
        return height;
    }

    @Override
    public double calculateArea() {
        calculateHeight();
        area = (1d/ 2) * sideA * height;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter=sideA+sideB+sideC;
       return perimeter;
    }

    @Override
    public String toString() {
        return "Сторона А равна " + sideA + " | Сторона B равна " + sideB + " | Сторона C равна " + sideC + " | Площадь треугольника равна "
                + calculateArea() + " | Периметр равен " + calculatePerimeter() + " | Высота равна " + calculateHeight() + " | " + typeOfTriangle();
    }
}

