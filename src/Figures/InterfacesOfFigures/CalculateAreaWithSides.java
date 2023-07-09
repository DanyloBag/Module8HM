package Figures.InterfacesOfFigures;

public interface CalculateAreaWithSides extends CalculateArea{
    @Override
    default double getArea(){
        int side = 0;
        return Math.pow(side,2);
    }
}
