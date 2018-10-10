package week4.task1;

public class CamCaophong extends QuaCam {
    private String kichthuoc;
    private int giaban;

    public CamCaophong(String s, int gb){
        this.kichthuoc = s;
        this.giaban = gb;
    }

    public CamCaophong(){
        this.kichthuoc = "";
        this.giaban = 0;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public int getGiaban() {
        return giaban;
    }
public void setGiaban(int giaban) {
        this.giaban = giaban;
    }


    public void gioiThieu(CamCaophong s){
        
        System.out.println("cam cao phong co kich thuoc la" + s.getKichthuoc());
        System.out.println("cam cao phong co gia ban la " + s.getGiaban());
    }

  
    }

