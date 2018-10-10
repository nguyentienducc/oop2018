package week4.task2;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double lenth = 1.0;

    public Rectangle(){

    }

    public Rectangle(double width , double lenth){
        this.lenth = lenth;
        this.width = width;
    }

    public Rectangle(double width ,double lenth, String color , boolean filled){
        this.width = width;
        this.lenth = lenth;
        setColor(color);
        setFilled(filled);
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setLenth(double lenth) {
        this.lenth = lenth;
    }
    public double getLenth() {
        return lenth;
    }


    public double getArea(){
        double s= getLenth() * getWidth();
        return s;
    }

    public double getPerimeter(){
        double c = 2 * (getWidth() + getLenth());
        return c;
    }

    public String toString(){
        return null;
    }
}
