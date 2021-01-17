package zoo;

import java.util.ArrayList;

public class Kigyok extends Ketrec {

	double kigyoMeret = 5.0;
	String eszik = "madar";

	public Kigyok(double szabadHely, ArrayList<String> beutaltak, int tooMuch, double kigyoMeret) {
		super(szabadHely, beutaltak);
		this.kigyoMeret = kigyoMeret;
	}

	public static void kigyoEloszto(double kigyoMeret, double szabadHely) {
		if(szabadHely < kigyoMeret) {
			terrariumSzam++;
		} else {
			szabadHely -= kigyoMeret;
		}
		}
	
}