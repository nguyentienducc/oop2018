package Tudien;

import javax.security.sasl.SaslException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import static java.lang.Thread.sleep;

public class DictionaryApplication extends Frame implements ActionListener  {
    private TextField textField;
    private TextArea textArea;
    DictionaryManagement dictionaryManagement=new DictionaryManagement();
    String w=null;

    public void runApplication()throws SQLException,ClassNotFoundException {


//        Frame frame=new Frame("từ điển anh việt");
        textField=new TextField();
        textField.setBounds(60,80,170,20);
        textArea =new TextArea();
        textArea.setBounds(60,250,1000,500);

        Button button=new Button("Dịch");
        button.setBounds(100,120,80,30);

        button.addActionListener(this);
//        String word=textField.getText();
//        w=dictionaryManagement.LockupFromMysql(word);

        setTitle("vidu");
        add(button);
        add(textField);
        add(textArea);
        setSize(400,300);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e )  {
        w=textField.getText();
//        DictionaryManagement dictionaryManagement=new DictionaryManagement();
        try {
            dictionaryManagement.LockupFromMysql();
        } catch (SQLException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        textArea.setText(w);
    }
}
