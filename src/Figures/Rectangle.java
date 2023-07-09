package Figures;
import Figures.InterfacesOfFigures.CalculateAreaWithSides;

class Rectangle extends Shape implements CalculateAreaWithSides {
    public static final String name = "Rectangle";
    private int sideA;
    private int sideB;
    private Color color;

    public Rectangle(int sideA, int sideB,Color color){
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public String printFigureName(){
        return name;
    }

    public double getArea(){
        return sideA * sideB;
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
