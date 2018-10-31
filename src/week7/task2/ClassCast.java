package week2.task2;

public class ClassCast {
    public int converterS(Object s) throws ClassCastException{
        return (int)s;
    }
    public static void main(String[] args){
        try {
            System.out.println(new ClassCast().converterS("123"));
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }
}
