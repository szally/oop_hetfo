package proba;

import java.awt.Color;
import sajat.*;
import masik.*;
import harmadik.*;
import sajat.ISzinezheto;

public class Teszt {

	public static String main(String[] args) {
		ISzinezheto szinespont = new Szinespont(Color.BLUE);
		
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		
		return null;
		
		
	}
	public static void setDefaultSzin(ISzinezheto objektum){
		objektum.setSzin(objektum.alapertelmezettSzin);
	}

}
