import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab6a2 {

	public static void main(String[] args) {
		
		try {
		Scanner s=new Scanner(System.in);	
		System.out.println("Input an integer");	
		int a=s.nextInt();
		System.out.println("Input a float");
		float b=s.nextFloat();
		
		System.out.println(a/b);
		System.out.println("Done!");
		
		}
		catch (InputMismatchException | ArithmeticException e) {
			System.out.println("Try a valid input");
		}
		
	}
}