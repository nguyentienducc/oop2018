package week9;
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logge
public class Utils {
   
    public static String readContentFromFile(String path) throws IOException{
        File f = new File(path);
        FileReader fr = new FileReader(f);
        BufferedReader bd = new BufferedReader(fr);
        String line = bd.readLine();
        bd.close();
        return line;
    }
    public static void writeContentToFile(String path) throws IOException{
        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Nguyen Tien Duc");
        bw.close();
    }
    public static void writeContentToFileAppend(String path) throws IOException{
        File f = new File(path);
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.append("\nNguyen Tien Duc");
        bw.close();
    }
    public static File findFileByName(String folderPath, String fileName){
        File f = new File(folderPath);
        if(f.isDirectory()){
            String[] l = f.list();
            for(String s : l){
                if(s.equals(fileName)){
                    return new File(f.getAbsolutePath() + "\\" + fileName);
                }
                File ff = findFileByName(f.getAbsolutePath() + "\\" + s, fileName);
                if(ff != null)
                    return ff;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        
        try {
            // TODO code application logic here
            System.out.println(readContentFromFile("C:\\Users\\Genius\\Documents\\d.txt"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            writeContentToFile("C:\\Users\\Genius\\Documents\\d.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            writeContentToFileAppend("C:\\Users\\Genius\\Documents\\d.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        if(findFileByName("C:\\Users\\Genius\\Documents", "d.txt") != null)
            System.out.println(findFileByName("C:\\Users\\Genius\\Documents", "d.txt").getAbsolutePath());
    }
}
}
