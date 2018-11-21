/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Task2 {
    public static <T extends Comparable> T GetMax(ArrayList<T> arr)
    {
        T max = arr.get(0);
        for(int i = 1 ; i < arr.size() ; i++) {
            if(arr.get(i).compareTo(max) > 0)
            {
                max = arr.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> Arr=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=0;i<num;i++)
        {
            Arr.add(scanner.nextInt());
        }
        System.out.println("GIÁ TRỊ LỚN NHẤT CỦA MẢNG LÀ : " +GetMax(Arr));
    }
}
