package zoo;

public class Madarak extends Animal {
	String eszik = "rovar";
	
	public Madarak(String name, double meret) {
		super(name, meret);
		this.name = "madar";
		this.meret = 3.0;
	}

	public static int madarEloszto(double madarMeret, double szabadHely) {
		 
		if(szabadHely < madarMeret) {
			madarKetrecSzam++;
		} else {
			szabadHely -= madarMeret;
		}
		return madarKetrecSzam;
		}
	
}