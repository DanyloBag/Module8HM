package Figures;

abstract class Shape {
    private static String name;
    private  Color color;

    public abstract String getName();

    public String printFigureName(){
        return name;
    }

    public Color getColor() {
        return color;
    }
    public void  getFigureInfo(){}


}
