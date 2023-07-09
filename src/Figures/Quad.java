package Figures;
import Figures.InterfacesOfFigures.CalculateAreaWithSides;

class Quad  extends Shape implements CalculateAreaWithSides {
    private static final String name = "Quad";
    private int sideA;
    private Color color;

    public Quad(int sideA, Color color){
        this.sideA = sideA;
        this.color = color;
    }

    @Override
    public String printFigureName(){
        return name;
    }
    public int getSideA() {
        return sideA;
    }


    public double getArea() {
        return Math.pow(sideA,2);
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
