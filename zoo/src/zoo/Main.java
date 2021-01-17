package zoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Ketrec {

	public Main(double szabadHely, ArrayList<String> beutaltak) {
		super(szabadHely, beutaltak);

	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws FileNotFoundException {
		double madarMeret = 3.0;
		double rovarMeret = 0.1;
		double medveMeret = 7.5;
		double farkasMeret = 1.5;
		double kigyoMeret = 5.0;

		ArrayList<String> madarKetrec = new ArrayList<>();
		ArrayList<String> terrarium = new ArrayList<>();
		ArrayList<String> ragadozoKifuto = new ArrayList<>();
		ArrayList<String> eloszto = new ArrayList<>();

		File text = new File("C:\\githubrepo\\Java\\zoo\\src\\allatok.txt");
		// read file
		// Reading each line of file using Scanner class
		Scanner scnr = new Scanner(text);

		int lineNumber = 1;
		while (scnr.hasNextLine()) {
			eloszto.add(scnr.nextLine());

//			System.out.println(lineNumber + " :" + eloszto);
			lineNumber++;
		}
		

		while (scnr.hasNext()) {

			switch (scnr.nextLine()) {

			case "madar":
				for(int i = 0; i < madarKetrec.size(); i++) {
			//	for (String madaroszt : madarKetrec) {
					Madarak.madarEloszto(madarMeret, szabadHely);
				}
				
				break;

			case "rovar":
				for (String rovaroszt : terrarium) {
					Rovarok.rovarEloszto(rovarMeret, szabadHely);
				}
				
				break;

			case "kigyo":
				for (String kigyooszt : terrarium) {
					Kigyok.kigyoEloszto(kigyoMeret, szabadHely);
				}
				break;

			case "farkas":
				for (String farkasoszt : ragadozoKifuto) {
					Farkasok.farkasEloszto(farkasMeret, szabadHely);
				}
				break;

			case "medve":
				for (String medveoszt : ragadozoKifuto) {
					Medvek.medveEloszto(medveMeret, szabadHely);
				}
				break;

			}
		}
		System.out.println("Madarak: " + madarKetrec.toString());
		scnr.close();
		
//		System.out.println(terrarium.toString());
//		System.out.println(ragadozoKifuto.toString());
//		System.out.println(madarKetrec.toString());
//end of reading file

	}

}
