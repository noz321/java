package zoo;

public class Rovarok extends Animal{
	String eszik = "farkas";

	
	public Rovarok(String name, double meret) {
		super(name, meret);
		this.name = "rovar";
		this.meret = 0.1;
	
	}

	public static void rovarEloszto(double rovarMeret, double szabadHely) {
		if(szabadHely == 0) {
			terrariumSzam++;
		} else {
			szabadHely -= rovarMeret;
		}
		}
	
}