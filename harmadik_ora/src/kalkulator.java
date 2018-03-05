import java.util.Scanner;

public class kalkulator {
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in); //bal oldal - statikus, jobb oldal - dinamikus
		//java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Please give me the first operand!");
		System.out.println("The first operand:");
		double first_operand = input.nextDouble();   
		
		System.out.println("Please give me the second operand!");
		System.out.println("The second operand:");
		double second_operand = input.nextDouble();
		
		System.out.println("Give me the operator!");
		System.out.println("The operator:");
		String operator = input.nextLine(); 
		operator = input.nextLine(); //space irhato
		//operator = input.next();//csak egy szo
		
		
		switch (operator) {
		case "+":
			System.out.println("Result:"+ (first_operand + second_operand));
			break;
		case "-":
			System.out.println("Result:"+ (first_operand - second_operand));
			break;
		case "*":
			System.out.println("Result:"+ (first_operand * second_operand));
			break;
		case "/":
			System.out.println("Result:"+ (first_operand / second_operand));
			break;
	
		default:
			System.out.println("Not a valid input!");
			break;
		}
		
		System.out.println("Give me the expression:");
		System.out.println("Expression:");
		String expression = input.nextLine(); 
		//expression = input.nextLine();
		
		String[] array =  expression.split(" ");
		first_operand = Double.parseDouble(array[0]);
		second_operand = Double.parseDouble(array[2]);
		operator = array[1];
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		input.close();
	}
}
