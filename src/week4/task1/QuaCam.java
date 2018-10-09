
package week4.task1;
public class QuaCam extends HoaQua{
	private String loaicam;
	private int ngaynhap;
public QuaCam(){
	this.loaicam="";
	this.ngaynhap=0;
}
public void setLoaicam(String loaicam ){
	this.loaicam=loaicam;
}
public String getLoaicam(){
	return loaicam;
}
public void setNgaynhap(int ngaynhap){
	this.ngaynhap=ngaynhap;
}
public int getNgaynhap(){
	return ngaynhap;
}
public void congdungCam(){
	System.out.println("cong dung cua cam la : ");
	System.out.println("giu cho than khoe manh ");
	System.out.println("Lam cho tim khoe mANH ");
	System.out.println("cai thien suc khoe cho mat ");
}
public void kiemTra(Quacam qc1, Quacam qc2){
	if(sosanhsoluong(qc1,qc2)){
		System.out.println("nhap cung so luong ");	
	}
	else{
		System.out.println("nhap khac so luong ");
	}
}
}