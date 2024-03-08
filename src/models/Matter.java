package models;

public class Matter {

    public double mass;
    private double area;
    public String name;
    public int xPosition = 0;
    public int yPosition = 0;
    public int zPosition = 0;

    
    // Constructor
    public Matter(String name, int xPosition, int yPosition, double mass) {
        this.name = "";
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.mass = mass;
    }

    // Area methods
    public void setArea(double lenght, double breath){
        area =  lenght * breath;
    }
    public void setArea(double lenght, double breath, double height){
        area =  lenght * breath * height;
    }
    public void setArea (int length, int breath){
        area =  length * breath;
    }
    public void setArea (int length, int breath, int height){
        area =  length * breath * height;
    }
    public void setArea (float length, float breath){
        area = length * breath;
    }

    public void setArea (float length, float breath, float height){
        area = length * breath * height;
    }
    public double getArea(){
        return area;
    }
    // end of area


    // Coordinates methods
    public int[] getCoordinates(){
        int[] coordinates = {xPosition, yPosition, zPosition};
        return coordinates;
    }

    public void setZPosition(int zPosition){
        this.zPosition = zPosition;
    }
}
