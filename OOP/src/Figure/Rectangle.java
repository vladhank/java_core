package Figure;

public class Rectangle extends Quadrilateral implements DiagonalRectangle{
    private int sideA;
    private int sideB;
    private double diagonal;
    private double area;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateDiagonal(){
        diagonal=Math.sqrt(Math.pow(sideA,2)+Math.pow(sideA,2));
        return diagonal;
    }

    @Override
    public double calculateArea() {
        area=sideA*sideB;
        return  area;
    }


    @Override
    public String toString() {
        return "Сторона А равна " +sideA+ " | Сторона B равна "+ sideB+" | Площадь квадрата равна "
                +calculateArea() + " | Периметр равен " +calculatePerimeter() + " | Диагональ "+calculateDiagonal();
    }
}
