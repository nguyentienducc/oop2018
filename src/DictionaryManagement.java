package Tudien;

import javax.lang.model.type.NullType;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class DictionaryManagement {

    Connection connection;
    Scanner scanner=new Scanner(System.in);

    {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:tudien.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void LockupFromMysql() throws SQLException,ClassNotFoundException{
        String word_required=scanner.nextLine();
        Word word=new Word();

        PreparedStatement  statement=connection.prepareStatement("SELECT  idx,word,detail FROM tbl_edict WHERE word LIKE ? ORDER BY word ASC LIMIT 1 ");
        statement.setString(1,word_required);
        try (ResultSet resultSet = statement.executeQuery()) {


            if (!resultSet.next()) {
                System.out.println("không có từ này");
            } else {
                String word_detail = resultSet.getString(3);
                int idx = resultSet.getInt(1);
//                return word_detail;

                if (!word_detail.endsWith("</Q></N></I></F></C>")) {
                    System.out.println(word_detail); ;
                } else {
                    System.out.println(word.FromatWord(word_detail));
                }

            }
        }
    }
    public void LockupLikeFromMysql() throws SQLException,ClassNotFoundException{
        String word_t=scanner.nextLine();
        ArrayList<String> a=new ArrayList<>();
        try{
            PreparedStatement  statement=connection.prepareStatement("SELECT  word,detail FROM tbl_edict WHERE word LIKE ? ORDER BY word ASC LIMIT 21 ");

            statement.setString(1,word_t+"%");

            ResultSet resultSet=statement.executeQuery();

            while (resultSet.next()){
                String index=resultSet.getString(1);
                System.out.println(index);

            }

            connection.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
//        return a;
    }

    public void InsertFromMysql()throws SQLException,ClassNotFoundException{
        String word_t=scanner.nextLine();
        String word_e=scanner.nextLine();
        try{

            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO tbl_edict (word,detail) VALUES (?,?)");

            preparedStatement.setString(1,word_t);
            preparedStatement.setString(2,word_e);
            preparedStatement.execute();



        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  void DeleteFromMysql() throws SQLException,ClassNotFoundException{
        String word_delete=scanner.nextLine();
        try{

            PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM tbl_edict WHERE word=?");

            preparedStatement.setString(1,word_delete);
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void UpdateFromMysql() throws SQLException,ClassNotFoundException{
        String word_taget_update=scanner.nextLine();
        String word_explan_update=scanner.nextLine();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement("UPDATE tbl_edict SET detail=? WHERE word=? ");
            preparedStatement.setString(1,word_explan_update);
            preparedStatement.setString(2,word_taget_update);
            System.out.println(word_taget_update);
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
