package Figures;

abstract class Shape {
    private static String name;
    private  Color color;

    public String getName() {
        return name;
    }

    public String printFigureName(){
        return name;
    }

    public Color getColor() {
        return color;
    }
    public void  getFigureInfo(){}

    public static void printShapeName(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Circle");
        } else if (shape instanceof Quad) {
            System.out.println("Quad");
        } else if (shape instanceof Oval) {
            System.out.println("Oval");
        } else if (shape instanceof Rectangle) {
        System.out.println("Rectangle");
        }else if (shape instanceof Triangle) {
            System.out.println("Triangle");
        } else {
            System.out.println("Shape");
        }
    }
}
