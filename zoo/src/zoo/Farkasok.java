package zoo;

import java.util.ArrayList;

public class Farkasok extends Ketrec {

	double farkasMeret = 1.5;
	String eszik = "madar";

	public Farkasok(double szabadHely, ArrayList<String> beutaltak, int tooMuch, double farkasMeret,
			String eszik) {
		super(szabadHely, beutaltak);
		this.farkasMeret = farkasMeret;
		this.eszik = eszik;
	}

	public static void farkasEloszto(double farkasMeret, double szabadHely) {
		if(szabadHely < farkasMeret) {
			ragadozoKifutoSzam++;
		} else {
			szabadHely -= farkasMeret;
		}
		}
}