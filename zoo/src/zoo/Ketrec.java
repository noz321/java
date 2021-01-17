package zoo;

import java.util.ArrayList;

public class Ketrec {

	static double meret;
	static double szabadHely = 27.5;
	ArrayList<String> beutaltak = new ArrayList<>();
	static int terrariumSzam = 0;
	static int madarKetrecSzam = 0;
	static int ragadozoKifutoSzam = 0;

	
	public Ketrec(double meret, double szabadHely, ArrayList<String> beutaltak) {
		Ketrec.meret = 27.5;
		Ketrec.szabadHely = 27.5;
		this.beutaltak = null;
	
	}


	public double getMeret() {
		return meret;
	}

	public ArrayList<String> getBeutaltak() {
		return beutaltak;
	}

	public void setBeutaltak(ArrayList<String> beutaltak) {
		this.beutaltak =beutaltak;
	}

	public double getSzabadHely() {
		return szabadHely;
	}

	public void setSzabadHely(double szabadHely) {
		Ketrec.szabadHely += szabadHely;
	}

	@Override
	public String toString() {
		return "Ketrec [meret= " + meret + ", szabadHely= " + szabadHely + ", beutaltak= " + beutaltak + "]";
	}
}
