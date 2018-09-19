package Figure;

public abstract class Figure {
    private String compareFigures;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void isAreaEqual(Figure figure) {
        if (this.calculateArea() == figure.calculateArea()) {
            System.out.println("Площади фигур равны");
        } else System.out.println("Площади фигур неравны");

    }
}
