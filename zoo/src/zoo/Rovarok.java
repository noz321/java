package zoo;

import java.util.ArrayList;

public class Rovarok extends Ketrec{

	static double rovarMeret = 0.1;
	String eszik = "farkas";

	public double getRovarMeret() {
		return rovarMeret;
	}

	public Rovarok(double meret, double szabadHely, ArrayList<String> beutaltak, int tooMuch, double rovarMeret,
			String eszik) {
		super(meret, szabadHely, beutaltak);
		Rovarok.rovarMeret = rovarMeret;
		this.eszik = eszik;
	}
	
	public static void rovarEloszto() {
		if(szabadHely == 0) {
			terrariumSzam++;
		} else {
			szabadHely -= rovarMeret;
		}
		}
	
}