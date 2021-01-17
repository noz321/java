package zoo;

import java.util.ArrayList;

public class Madarak extends Ketrec {
	double madarMeret = 3.0;
	String eszik = "rovar";
	static int madarKetrecSzam;
	
	 public static int madarEloszto(double madarMeret, double szabadHely) {
		 
		if(szabadHely < madarMeret) {
			madarKetrecSzam++;
		} else {
			szabadHely -= madarMeret;
		}
		return madarKetrecSzam;
		}

	public Madarak(double szabadHely, ArrayList<String> beutaltak, int tooMuch, double madarMeret,
			String eszik) {
		super(szabadHely, beutaltak);
		this.madarMeret = madarMeret;
		this.eszik = eszik;

		madarEloszto(madarMeret,szabadHely);
	}


	
	
}