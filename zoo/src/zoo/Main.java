package zoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Ketrec {
	
	public Main(double meret, double szabadHely, ArrayList<String> beutaltak) {
		super(meret, szabadHely, beutaltak);
		// TODO Auto-generated constructor stub
		
		
		
		
	}

	public static void main(String[] args) throws FileNotFoundException {
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

			System.out.println(lineNumber + " :" + eloszto);
			lineNumber++;
		}
		scnr.close();

		for (String szetdobal : eloszto) {

			switch (scnr.nextLine()) {
			
			
				case "madar": 
					
					Madarak.madarEloszto(getMadarMeret(), szabadHely);
					break;
					
				case "rovar":
					
					Rovarok.rovarEloszto(getRovarMeret(), szabadHely);
					break;

				case "kigyo":
					
					Kigyok.kigyoEloszto() ;
					break;
					
				case "farkas":
					
					Farkasok.farkasEloszto(geFarkasMeret(), szabadHely);
					break;
					
				case "medve":
					
					Medvek.medveEloszto(getMedveMeret(), szabadHely);
					break;
					
			}
//			else if ((eloszto.contains("medve")) && ((ragadozoKifuto.getSzabadHely() > 7.5))) {
//				ragadozoKifuto.beutaltak.add("medve \\n");
//				ragadozoKifuto.setSzabadHely(-7.5);
//
//			} else if ((eloszto.contains("farkas")) && ((ragadozoKifuto.getSzabadHely() > 4.5))
//					&& (ragadozoKifuto.getTooMuch() < 3)) {
//				ragadozoKifuto.beutaltak.add("farkas \\n");
//				ragadozoKifuto.setSzabadHely(-4.5);
//				ragadozoKifuto.setTooMuch(1);
//
//			} else if ((eloszto.contains("rovar")) && ((terrarium.getSzabadHely() > 0.1))) {
//				terrarium.beutaltak.add("rovar \\n");
//				terrarium.setSzabadHely(-0.1);
//
//			} else if ((eloszto.contains("kigyo")) && ((terrarium.getSzabadHely() > 5))) {
//				terrarium.beutaltak.add("kigyo \\n");
//				terrarium.setSzabadHely(-5);
//			}
//			}
//		}		
			System.out.println(eloszto.toString());
//end of reading file
		}
	}

}


