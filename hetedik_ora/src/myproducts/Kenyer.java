package myproducts;


public class Kenyer extends Product {
	private double mennyiseg;

	public Kenyer(String string, int nettoAr, int afakulcs, double mennyiseg) {
		super(string, nettoAr, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	@Override
	public String toString() {
		return "Kenyer [" + super.toString() + "egysegar=" + brutto() / mennyiseg + "]";
	}

	public double getMennyiseg() {
		return mennyiseg;
	}
	
	public static boolean nagyobb_egysegar(Kenyer elso_kenyer,Kenyer masodik_kenyer){
		return elso_kenyer.brutto() / elso_kenyer.mennyiseg > masodik_kenyer.brutto() / masodik_kenyer.mennyiseg;
	}
	
}
