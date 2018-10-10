package week4.task2;

public class Square extends Rectangle {// square la con cua rectangle
    double side;

    public Square(){

    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        System.out.println(side);
    }

    public void setLength(double side){
        System.out.println(side);
    }

    public String toString(){
        return null;
    }
}