package Figure;

public class Ellipse extends Circle {
    private int radius;
    private double area;
    private int radius2;
    private double perimeter;

    public Ellipse(int radius, int radius2) {
        this.radius=radius;
        this.radius2 = radius2;
    }


    @Override
    public double calculateArea() {
        area = Math.PI * radius2 * radius;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter=2*Math.PI*Math.sqrt(((Math.pow(radius,2)+Math.pow(radius2,2)))/2);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Первый радиус круга равен " +radius+" | Второй радиус круга равен " +radius2+" | Площадь круга равна "
                +calculateArea() + " | Периметр равен " +calculatePerimeter();
    }
}
