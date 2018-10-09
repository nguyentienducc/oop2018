public class HoaQua {
    private String mausac;
    private int soluong;

    public HoaQua(){
        this.mausac = "";
        this.soluong = 0;
    }

    public HoaQua(String ms, int sl){
        this.mausac = ms;
        this.soluong = sl;
    }
    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getMausac() {
        return mausac;
    }
    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void congdung(){
        System.out.println("Hoa qua la thuc pham rat bo ich cho moi nguoi");
        System.out.println("La nguon cung cap vitamin va cac chat dinh duong cho con nguoi");
        System.out.println("Moi loai qua deu co cong dung rieng cua chinh no");
    }

    public boolean soSanhSoluong(HoaQua hq1, HoaQua hq2){
        return hq1.getSoluong() == hq2.getSoluong();
    }
}
