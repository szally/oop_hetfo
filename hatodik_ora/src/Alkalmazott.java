
public class Alkalmazott {
	private static int nyugdijkorhatar = 65;
	
	private String nev;
	private int kor;
	private long fizetes;
	
	public Alkalmazott(String nev, int kor, long fizetes) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
		fizetes = kor * 10000;
	}
	
	public int hanyEvVanMegNyugdijig() {
		return nyugdijkorhatar - kor;
	}

	@Override
	public String toString() {
		return "Alkalmazott [Nev:" + nev + ", Kor:" + kor + ", Fizetes:"
				+ fizetes + ", Nyugdijig maradt evek szama:"
				+ hanyEvVanMegNyugdijig() + "]";
	}
	
	//csak veletlenszam generalashoz
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}

	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}
	
	public static Alkalmazott tobbEveVanHatraANyugdijig(Alkalmazott elsoAlkalmazott,
	Alkalmazott masodikAlkalmazott) {
		if (elsoAlkalmazott.hanyEvVanMegNyugdijig() > masodikAlkalmazott.hanyEvVanMegNyugdijig()){
			return elsoAlkalmazott;
		}
		else{
			return masodikAlkalmazott;
		}
	}
	
	
}
