package week2.task2;

public class ArrayIndexOfBound {
    public void printInt(int[] arr, int pos) throws ArrayIndexOutOfBoundsException{
        System.out.println(arr[pos]);
    }
    public static void main(String[] args){
        int[] arr = new int[0];
        try {
            new ArrayIndexOfBound().printInt(arr, 2);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}