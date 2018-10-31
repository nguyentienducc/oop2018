package week2.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFound {
    public void readFile(String path) throws FileNotFoundException{
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while(sc.hasNext())
            System.out.println(sc.nextLine());
        sc.close();
    }
    public static void main(String[] args){
        try {
            new FileNotFound().readFile("C:\\Users\\Genius\\Destop\\xyz.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}