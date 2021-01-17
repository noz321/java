package zoo;

import java.util.ArrayList;

public class Medvek extends Ketrec {

	double medveMeret = 7.5;
	String[] eszik = { "rovar", "kigyo", "madar" };


	public Medvek(double szabadHely, ArrayList<String> beutaltak, int tooMuch, double medveMeret,
			String[] eszik) {
		super(szabadHely, beutaltak);
		this.medveMeret = medveMeret;
		this.eszik = eszik;
	}

	public static void medveEloszto(double medveMeret, double szabadHely) {
		if(szabadHely < medveMeret) {
			ragadozoKifutoSzam++;
		} else {
			szabadHely -= medveMeret;
		}
		}
}