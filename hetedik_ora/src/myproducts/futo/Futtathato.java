package myproducts.futo;

import myproducts.*;

public class Futtathato {

	public static void main(String[] args) {
		Product aru_objektum = new Product("aru", 20, 27);
		Kenyer kenyer_objektum = new Kenyer("kenyer", 100, 15, 0.75);
		
		System.out.println("A termek adatai:");
		System.out.println(aru_objektum);
		System.out.println(kenyer_objektum);
		
		int melyik_dragabb = aru_objektum.dragabb_e(kenyer_objektum);
		//if-fel kiíratni
	}

}
