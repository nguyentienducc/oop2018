package Tudien;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class DictionaryComandline extends Dictionary{

    public void showAllWords(Dictionary dictionary){
        for(int i=0;i<100;i++)
            if ( !dictionary.word.get(i).word_taget.equals("exit")) {
                System.out.println(dictionary.word.get(i).word_taget + "  " + dictionary.word.get(i).word_explain + "\n");
            }
            else break;


    }
//    public void dictionBasic(){
//        DictionaryManagement dictionaryManagement=new DictionaryManagement();
////        DictionaryComandline dictionaryComandline= new DictionaryComandline();
//        Dictionary dictionary=new Dictionary();
//        dictionaryManagement.insertFromComanline(dictionary);
//        showAllWords(dictionary);
//    }
    public void dictionAdvance() throws IOException, SQLException,ClassNotFoundException {
        DictionaryManagement dictionaryManagement=new DictionaryManagement();
//        dictionaryManagement.insertFromFile();
        Scanner scanner=new Scanner(System.in);
        String w="a";
        while (!w.equals("exit")){
             w=scanner.next();
            if(w.equals("lockup") ) dictionaryManagement.LockupFromMysql();
            if(w.equals("lockuplike")) dictionaryManagement.LockupLikeFromMysql();
            if(w.equals("insert")) dictionaryManagement.InsertFromMysql();
            if(w.equals("delete")) dictionaryManagement.DeleteFromMysql();
        }



    }
}
