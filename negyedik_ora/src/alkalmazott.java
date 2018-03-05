
public class alkalmazott {
	private String nev;
	private long fizetes;
	
	public void fizetestNovel(long ertek) {
		fizetes += ertek;			
	}

	//String összefűzésnél:
	public String toString() {
		return "Alkalmazott neve: " + nev + ", fizetese = " + fizetes + " Ft.";
	}
	
	//getter Nev
	public String getNev() {
		return nev;
	}

	//setter
	public void setNev(String nevparameter) {
		nev = nevparameter;
	}
	
	//getter Fizetes
	public long getFizetes() {
		return fizetes;
	}
	
	//setter
	public void setFizetes(long fizetesparameter) {
		fizetes = fizetesparameter;
	}
	
	public boolean fizetesIntervallumokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar &&
				fizetes <= felsohatar;
	}

	public long fizetendoAdo() {
		return (long)(fizetes * 0.16);
	}
	
	public boolean nagyobbfizetesuMint(alkalmazott masik) {
		return fizetes > masik.fizetes;
	}

}
