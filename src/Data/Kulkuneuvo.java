package Data;

public class Kulkuneuvo {
	private float hinta;
	private String vari;
	private int maksimiNopeus;
	private int nopeus;
	
	public Kulkuneuvo() {
		
	}
	
	public Kulkuneuvo(float hinta, String vari, int maksimiNopeus) {
		this.hinta=hinta;
		this.vari=vari;
		this.maksimiNopeus=maksimiNopeus;
	
	}
	

	public float getHinta() {
		return hinta;
	}

	public void setHinta(float hinta) {
		this.hinta = hinta;
	}

	public String getVari() {
		return vari;
	}

	public void setVari(String vari) {
		this.vari = vari;
	}

	public int getMaksimiNopeus() {
		return maksimiNopeus;
	}

	public void setMaksimiNopeus(int maksimiNopeus) {
		this.maksimiNopeus = maksimiNopeus;
	}

	public int getNopeus() {
		return nopeus;
	}

	public void setNopeus(int nopeus) {
		this.nopeus = nopeus;
	}
	
//	public int kiihdyta() {
//		this.nopeus + this.kiihdyta = kiihdyta;
//	}
	
//	public int hidasta() {
//		this.nopeus + this.kiihdyta = kiihdyta;
//	}

}
