package zoo;

import java.util.ArrayList;

public class Madarak extends Ketrec {
	double madarMeret = 3.0;
	String eszik = "rovar";
	
	 public static void madarEloszto(double madarMeret, double szabadHely) {
		 
		if(szabadHely < madarMeret) {
			madarKetrecSzam++;
		} else {
			szabadHely -= madarMeret;
		}
		}


	
	public double getMadarMeret() {
		return madarMeret = 3.0;
	}

	public Madarak(double meret, double szabadHely, ArrayList<String> beutaltak, int tooMuch, double madarMeret,
			String eszik) {
		super(meret, szabadHely, beutaltak);
		this.madarMeret = madarMeret;
		this.eszik = eszik;

		madarEloszto(madarMeret,szabadHely);
	}
}