package zoo;

import java.util.ArrayList;

public class Medvek extends Ketrec {

	double medveMeret = 7.5;
	String[] eszik = { "rovar", "kigyo", "madar" };

	public double getMeret() {
		return medveMeret;
	}

	public Medvek(double meret, double szabadHely, ArrayList<String> beutaltak, int tooMuch, double medveMeret,
			String[] eszik) {
		super(meret, szabadHely, beutaltak);
		this.medveMeret = medveMeret;
		this.eszik = eszik;
	}

	public void medveEloszto() {
		if(szabadHely < medveMeret) {
			ragadozoKifutoSzam++;
		} else {
			szabadHely -= medveMeret;
		}
		}
}