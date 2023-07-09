package Figures;
import Figures.InterfacesOfFigures.CalculateAreaWithRadius;

class Oval extends Shape implements CalculateAreaWithRadius {
    private static final String name = "Oval";
    private int littleRadius;
    private int bigRadius;
    private Color color;

    public Oval(int littleRadius, int bigRadius, Color color){
        this.littleRadius = littleRadius;
        this.bigRadius = bigRadius;
        this.color = color;
    }

    @Override
    public String printFigureName(){
        return name;
    }
    public int getLittleRadius() {
        return littleRadius;
    }
    public int getBigRadius() {
        return bigRadius;
    }


    @Override
    public double getArea() {
        return Math.round(Math.PI * bigRadius * littleRadius);
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
