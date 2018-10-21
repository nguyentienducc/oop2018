package Tudien;

public class Word {
    public String word_taget;
    public String word_explain;
    public Word(){
        word_taget=null;
        word_explain=null;
    };
    public Word(String word_taget,String word_explain){
        this.word_taget=word_taget;
        this.word_explain=word_explain;
    }

    public void setWord_taget(String word_taget) {
        this.word_taget = word_taget;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
    public  String FromatWord(String word){
        String rs="\n";
        String word_f1=word.substring(16,word.length()-20);
        String word_f2[]=word_f1.split("<br />");
        for(String w:word_f2){
            rs=rs+w+"\n";
        }

        rs=rs.replace("+"," :");
        rs=rs.replace("=","+");

        return rs;
    }
}
