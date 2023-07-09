package Figures.InterfacesOfFigures;

public interface CalculateAreaWithRadius extends CalculateArea {

    @Override
    default double getArea(){
        int radius=0;
        return Math.PI * Math.pow(radius,2);
    }
}
