
public class Teglalap {
	
	private int a_oldal;
	private int b_oldal;
	
	
	//Konstruktorok
	public Teglalap(int a_oldal, int b_oldal) {
//		super();
//		this.a_oldal = a_oldal;
//		this.b_oldal = b_oldal;
		setOldalak(a_oldal, b_oldal);
	}
	//téglalap létrehozása
	
	public Teglalap(int oldalhossz) {
//		this.a_oldal = this.b_oldal = oldalhossz;
//		this.a_oldal = oldalhossz;
//		this.b_oldal = oldalhossz;
		setOldalak(oldalhossz);
	}
	//négyzet létrehozása
	
	public int terulet() {
		return a_oldal * b_oldal;
	}

	public String toString() {
		return "Terulet: " + a_oldal +" * "+ b_oldal + ": " + terulet();
	}

//	public void setA_oldal(int a_oldal) {
//		this.a_oldal = a_oldal;
//	}
//
//	public void setB_oldal(int b_oldal) {
//		this.b_oldal = b_oldal;
//	}
	
	public void setOldalak(int a_oldal,int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	public void setOldalak(int oldalhossz) {
		this.a_oldal = oldalhossz;
		this.b_oldal = oldalhossz;
	}

	public boolean teruletNagyobbmint(Teglalap masikTeglalap) {
		return terulet() > masikTeglalap.terulet();
	}
	
	public boolean egyezikE(Teglalap masikTeglalap) {
		return a_oldal == masikTeglalap.a_oldal 
				&& b_oldal == masikTeglalap.b_oldal;
	}
	
}
