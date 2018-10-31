package week2.task2;

public class Arithmetic {
    public int Asin(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args){
        try {
            System.out.println(new Arithmetic().Asin(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

