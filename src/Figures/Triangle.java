package Figures;
import Figures.InterfacesOfFigures.CalculateAreaWithSides;

class Triangle  extends Shape implements CalculateAreaWithSides {
    public static final String name = "Triangle";
    private int sideA;
    private int high;
    private Color color;

    public Triangle(){}
    public Triangle(int sideA, int high, Color color){
        this.sideA = sideA;
        this.high = high;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String printFigureName(){
        return name;
    }

    public int getSideA() {
        return sideA;
    }

    public int getHigh() {
        return high;
    }

    @Override
    public double getArea(){
        return (sideA*high)/2;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void  getFigureInfo(){
        System.out.println("The name of figure is " + printFigureName() + "\nThe area of the figure is " + getArea() +
                "\nThe color of the figure is " + getColor());
    }
}
