package myproducts;

public class Product {
	private String nev;
	private int nettoAr;
	private int afakulcs;
	
	public Product(String nev, int nettoAr, int afakulcs) {
		super();
		this.nev = nev;
		this.nettoAr = nettoAr;
		this.afakulcs = afakulcs;
	}
	
	public int brutto(){
		return (int)(nettoAr * 1+(afakulcs/100.0));
	}

	@Override
	public String toString() {
		return "Product [nev=" + nev + ", brutto()=" + brutto() + "]";
	}

	public void nettoAr_novel(int szazalek){
		nettoAr = (int)(nettoAr * (1+ szazalek / 100.0));
	}
	
	public int dragabb_e(Product masikAru){
		if(brutto()> masikAru.brutto()){
			return 1;
		}
		else if(brutto()< masikAru.brutto()){
			return -1;
		}
		else
			return 0;
	}
	
}
