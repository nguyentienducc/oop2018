package week4.task1;

public class CamSanh extends CamCaophong{
    private int ngaynhap;
    private String nguongoc;

    public int getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(int ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public void gioiThieuCamSanh(CamCaophong c1){
        gioiThieu();
        System.out.println(  " Ngay nhap " + getNgaynhap()
                +", Gia: " + c1.getGiaban()  );
    }
}