package sajat;

public class Henger extends Hasab {
	private double sugar;
	
	public Henger(double magassag, double sugar) {
		super(magassag);
		this.sugar = sugar;
	}

	@Override
	public double getAlapterulet() {
		return sugar * sugar * Math.PI;
	}

	@Override
	public String toString() {
		return "Henger [Sugar=" + sugar + ", Alapterulet="
				+ getAlapterulet() + ", Magassag=" + getMagassag() + "]";
	}
	
	

}
