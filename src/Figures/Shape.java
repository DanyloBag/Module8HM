package Figures;

abstract class Shape {
    private String name;
    private  Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printFigureName(){
        return name;
    }

    public Color getColor() {
        return color;
    }
    public void  getFigureInfo(){}

}
