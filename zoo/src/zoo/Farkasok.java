package zoo;

public class Farkasok extends Animal {

	
	public Farkasok(String name, double meret) {
		super(name, meret);
		this.name = "farkas";
		this.meret = 1.5;
		
	}

	public static void farkasEloszto(double farkasMeret, double szabadHely) {
		if(szabadHely < farkasMeret) {
			ragadozoKifutoSzam++;
		} else {
			szabadHely -= farkasMeret;
		}
		}
}