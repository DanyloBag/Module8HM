package Figures;
import Figures.InterfacesOfFigures.CalculateAreaWithRadius;

class Circle extends Shape implements CalculateAreaWithRadius {
    private static final String name = "Circle";
    private int radius;
    private Color color;


    public Circle(int radius, Color color){
        this.radius = radius;
        this.color=color;
    }

    @Override
    public String printFigureName(){
        return name;
    }

    public int getRadius() {
        return radius;
    }


    public double getArea(){
        return Math.round(Math.PI *  Math.pow(radius,2));
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
