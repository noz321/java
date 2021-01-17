package zoo;

import java.util.ArrayList;

public class Rovarok extends Ketrec{

	double rovarMeret = 0.1;
	String eszik = "farkas";

	public Rovarok(double szabadHely, ArrayList<String> beutaltak, int tooMuch, double rovarMeret,
			String eszik) {
		super(szabadHely, beutaltak);
		this.rovarMeret = rovarMeret;
		this.eszik = eszik;
	}
	
	public static void rovarEloszto(double rovarMeret, double szabadHely) {
		if(szabadHely == 0) {
			terrariumSzam++;
		} else {
			szabadHely -= rovarMeret;
		}
		}
	
}