package zoo;

public class Medvek extends Animal {

	public Medvek(String name, double meret) {
		super(name, meret);
		this.name = "medve";
		this.meret = 7.5;
		
	}



	public static void medveEloszto(double medveMeret, double szabadHely) {
		if(szabadHely < medveMeret) {
			ragadozoKifutoSzam++;
		} else {
			szabadHely -= medveMeret;
		}
		}
}