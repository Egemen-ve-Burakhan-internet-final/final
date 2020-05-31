package ogr;

import javax.servlet.http.HttpServletRequest;

public class Ogretmen {
	
	private String unvan;
	private String ad;
	private String soyad;
	private int ders;
	
	public Ogretmen(String unvan,String ad,String soyad,int ders){
		this.unvan = unvan;
		this.ad = ad;
		this.soyad = soyad;	
		this.ders = ders;
	}
	
	public Ogretmen(HttpServletRequest request)
	{
		this.unvan = request.getParameter("unvan");
		this.ad = request.getParameter("ad");
		this.soyad = request.getParameter("soyad");
		this.ders = Integer.parseInt(request.getParameter("ders"));
	}
	
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getDers() {
		return ders;
	}
	public void setDers(int ders) {
		this.ders = ders;
	}

	
}
