package zoo;

import java.util.ArrayList;

public class Kigyok extends Ketrec {

	double kigyoMeret = 5.0;
	String eszik = "madar";

	public double getKigyoMeret() {
		return kigyoMeret;
	}

	public Kigyok(double meret, double szabadHely, ArrayList<String> beutaltak, int tooMuch, double kigyoMeret) {
		super(meret, szabadHely, beutaltak);
		this.kigyoMeret = kigyoMeret;
	}

	public void kigyoEloszto() {
		if(szabadHely < kigyoMeret) {
			terrariumSzam++;
		} else {
			szabadHely -= kigyoMeret;
		}
		}
	
}