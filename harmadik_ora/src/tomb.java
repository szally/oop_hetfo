import java.util.Random;

public class tomb {
	public static void main (String[] args){
		
		//int [] array = new int [10];
		int array [] = new int [10];
		Random rand_num = new Random();
		
		//Veletlenszam 1-tol 50-ig
		
		for (int i = 0; i < array.length; i++) {
			//array[i] = rand_num.nextInt(50) + 1;
			array[i] =(int) (Math.random() * 50) + 1;//(Math.random()*30)+20 - 50 es 20 kozotti random szam; 30 = kulombseg
			System.out.println(array[i]);
			
		}
		
		System.out.println("Forditva");
		
		for (int i =  array.length - 1; i >= 0; i--) {
			
			System.out.println(array[i]);
		}
		
		//Legnagyobb paros szamanak megkeresese
		
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0){
				if (array[i] > max){
					max = array[i];
					System.out.println("Max:"+ max);
				}
			}
		}
		
	}
}
