package week4.task2;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color , boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    
    // dien tich
    public double getArea(){
        double x =  getRadius() * getRadius()*getPI();// dien tich bang pi*r(binh phuong)

        return x;
    }

    // chu vi
    public double getPerimeter(){
        double x = 2 * getPI() * getRadius();//chu vi bang 2pi nhaan voi r
        return x;
    }

    public final double getPI(){
        int n = 0;
        double s = 0 ;
        double r = 1;
        while (2*n + 1 <= 10000){
            s = s + r/(2*n + 1);
            r *= -1;
            ++n;
        }

        return 4*s;
    }

    public String toString(){
        return null;
    }

}