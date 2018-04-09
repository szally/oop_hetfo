//import java.util.Random;
//import java.util.Scanner;
import java.util.*;


public class Futtathato {
	public static void main(String[] args) {
		Scanner beolvas = new Scanner(System.in);
		int meret;
		System.out.println("Kerem adja meg az alkalmazottak szamat!");
		System.out.println("Meret:");
		meret = beolvas.nextInt();
		
		Alkalmazott alkalmazottak[] = new Alkalmazott[meret];
		Random veletlenszamobjektum = new Random();
		
		int nyugdijkorhatar = Alkalmazott.getNyugdijkorhatar();
		
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott("XY" + (i + 1), veletlenszamobjektum.nextInt(nyugdijkorhatar));
			
			System.out.println(alkalmazottak[i]);
		}
		
		Alkalmazott.setNyugdijkorhatar(70);
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			if (alkalmazott.hanyEvVanMegNyugdijig() <= 5) {
				System.out.println("5 evnel kevesebb:" + alkalmazott);
			}
		}
		
		
		beolvas.close();
	}

}
