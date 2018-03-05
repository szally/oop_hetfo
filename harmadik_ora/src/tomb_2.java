import java.util.Scanner;

public class tomb_2 {
	
	public static void main (String[] args){
		double array[] = new double [10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Give me the numbers ");
			array[i] = input.nextDouble();
		}
		
		double mertani_atlag = 1;
		
		for (int i = 0; i < array.length; i++) {
			mertani_atlag *= array [i];
		}
		mertani_atlag = Math.pow(mertani_atlag, 1.0 / array.length);
		System.out.println(mertani_atlag);
	}

}
