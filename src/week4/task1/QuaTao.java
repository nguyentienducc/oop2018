package week4.task1;
public class QuaTao extends HoaQua{
	private String xuatxu;
	private int khoiluong;
public QuaTao(){
	this.xuatxu="";
	this.khoiluong=0;
}
public void setLoaicam(String xuatxu ){
	this.xuatxu=xuatxu;
}
public String getXuatxu(){
	return xuatxu;
}
public void setKhoiluong(int khoiluong){
	this.khoiluong=khoiluong;
}
public int getKhoiluong(){
	return khoiluong;
}
public void congdungTao(){
	System.out.println("cong dung cua cam la : ");
	System.out.println("tot cho da va chong tram cam ");
	System.out.println("chua chung thieu mau ");
	System.out.println("giup xuong chac khoe");
}
public void kiemTra(Quatao t1, Quactao t2){
	if(sosanhmausac(t1,t2)){
		System.out.println("cung mot mau tao ");	
	}
	else{
		System.out.println("khac mau tao ");
	}
}
}
