package zoo;

import java.util.ArrayList;

public class Farkasok extends Ketrec {

	double farkasMeret = 1.5;
	String eszik = "madar";

	public double getMeret() {
		return farkasMeret;
	}

	public Farkasok(double meret, double szabadHely, ArrayList<String> beutaltak, int tooMuch, double farkasMeret,
			String eszik) {
		super(meret, szabadHely, beutaltak);
		this.farkasMeret = farkasMeret;
		this.eszik = eszik;
	}

	public void farkasEloszto() {
		if(szabadHely < farkasMeret) {
			ragadozoKifutoSzam++;
		} else {
			szabadHely -= farkasMeret;
		}
		}
}