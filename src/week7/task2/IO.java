package week2.task2;

import java.io.IOException;
public class IO {
    public void write() throws IOException{
        throw new IOException();
    }
    public static void main(String[] args){
        try {
            new IO().write();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}