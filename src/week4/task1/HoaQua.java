public class HoaQua {
    private String tenqua;
    private int soluong;

    public HoaQua(){
        this.tenqua = "";
        this.soluong = 0;
    }

    public HoaQua(String tq, int sl){
        this.tenqua = tq;
        this.soluong = sl;
    }
    public void setTenqua(String tenqua) {
        this.tenqua = tenqua;
    }

    public String getTenqua() {
        return tenqua;
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
