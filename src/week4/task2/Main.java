package week4.task2;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        Square sq1 = new Square(3,"green",false);
        System.out.println(sq1.getSide());
        System.out.println(sq1.getColor());
        System.out.println(sq1.isFilled());
        sq.setLength(3.5);
        sq.setWidth(3.5);

        System.out.println("\n");
        Rectangle r = new Rectangle(2,5,"sky",true);

        Rectangle r1 = new Rectangle();
        r.setWidth(4);
        r.setLenth(5);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());

        System.out.println("\n");
        sq.setLength(2);
        sq.setWidth(3);
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());

        System.out.println("\n");
        Circle c = new Circle();
        c.setRadius(4);
        System.out.println(c.getPI());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}