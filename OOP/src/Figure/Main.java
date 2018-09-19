package Figure;

public class Main {
    public static void main(String[] args) {

        Figure ellipse = new Ellipse(5, 7);
        Figure triangle = new Triangle(5, 5, 5);
        Figure circle = new Circle(5);
        Figure square = new Square(7);
        Figure rectangle = new Rectangle(3, 8);
        Figure tra = new RightTriangle(7, 6, 7);

        System.out.println(ellipse);
        System.out.println(triangle);
        System.out.println(circle);
        System.out.println(square);
        System.out.println(tra);
        System.out.println(rectangle);
        System.out.println();

        if (ShapeUtils.isTriangle(tra)) {
            System.out.println("Это треуголник");
        } else System.out.println("Не треуголник");

        if (ShapeUtils.isRectangle(rectangle)) {
            System.out.println("Это прямоугольник");
        } else System.out.println("Не прямоугольник");
        ellipse.isAreaEqual(square);
    }

}
