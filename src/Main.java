package Tudien;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class Main {
    public static void main(String[] args) throws IOException, SQLException,ClassNotFoundException {
        {
            try {
                Connection connection = DriverManager.getConnection("jdbc:sqlite:tudien.db");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DictionaryComandline dictionaryComandline=new DictionaryComandline();
        dictionaryComandline.dictionAdvance();
//        dictionaryComandline.dictionBasic();
//        Word word=new Word();
//        String word_f=word.FromatWord("<C><F><I><N><Q>@how /hau/<br />*  phó từ<br />- thế nào, như thế nào; sao, ra sao, làm sao<br />=he doesn't know how to behave+ hắn không biết xử sự thế nào<br />=how comes it? how is it?+ sao, sự thể ra sao? sao lại ra như vậy?<br />=how now?+ sao, thế là thế nào?<br />=how so?+ sao lại như thế được?<br />=how is it that...?+ làm sao mà...?, làm thế nào mà...?<br />- bao nhiêu; giá bao nhiêu<br />=how old is he?+ hắn bao nhiêu tuổi?<br />=how much (many)?+ bao nhiêu?<br />=how long?+ dài bao nhiêu? bao lâu?<br />=how are eggs today?+ hôm nay trứng giá bao nhiêu?<br />- làm sao, biết bao, xiếc bao, biết bao nhiêu, sao mà... đến thế<br />=how beautiful!+ sao mà đẹp thế! thật là đẹp biết bao!<br />- rằng, là<br />=he told us how he had got a job+ anh a nói với chúng tôi rằng anh ta đã kiếm được một công việc làm<br />- như, theo cái cách<br />=do it how you can+ anh làm việc đó như anh có thể; hây làm việc đó theo như cái cách mà anh có thể làm được<br />!and how!<br />- (từ Mỹ,nghĩa Mỹ),  (từ lóng), ((thường)(mỉa mai)) sao, mà có hơn thế nhiều nữa chứ!<br />!here's how!<br />- (xem) here<br />!how are you!<br />!how do you do!<br />!how d'ye do?<br />- anh có khoẻ không (câu hỏi thăm khi gặp nhau)<br />!how the deuce (devil, dickens)...<br />!how on earth...<br />- quái quỷ thế nào mà..., làm thế quái nào mà...<br />!how is that for high (queer, a surprise)?<br />- sao mà lạ thế?, sao mà lại kỳ quái thế?<br />!how much?<br />- (từ lóng) cái quái gì?, cái đếch gì?<br />=he plays the saxtuba - Plays the how much?+ nó biết thổi kèn xactuba biết thổi cái đếch gì<br />*  danh từ<br />- cách làm, phương pháp làm<br />=the how of it+ cách làm cái đó</Q></N></I></F></C>");
//        System.out.println(word_f);
//        DictionaryApplication dictionaryApplication=new DictionaryApplication();
//        dictionaryApplication.runApplication();

    }
}
