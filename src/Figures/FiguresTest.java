package Figures;
public class FiguresTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5,Color.RED);
        circle1.getFigureInfo();
        System.out.println();

        Oval oval1 = new Oval(9,2, Color.PURPLE);
        oval1.getFigureInfo();
        System.out.println();

        Quad quad1 = new Quad(5,Color.RED);
        quad1.getFigureInfo();
        System.out.println();

        Rectangle rectangle1 = new Rectangle(3,8, Color.BLUE);
        rectangle1.getFigureInfo();
        System.out.println();

        Triangle triangle1 = new Triangle(8, 9, Color.PINK);
        triangle1.getFigureInfo();


    }
}
