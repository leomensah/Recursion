/*Define a method to calculate the power of a number raised to another i.e. ab using
 *recursion where the numbers 'a' and 'b' are to be entered by the user.
 *
 */
import java.util.Scanner;
public class Q3 {
	public static void powNumber() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please the Number: ");
		int number = input.nextInt();
		int power;
		do {
			System.out.println("Enter the raised power (+ve number): ");
			power = input.nextInt();
			
		}while(power < 0);
		
		input.close();
		
		int num_power = recPowerNumber(number, power);
		System.out.print(number +" raised to the power "+ power + " = " + num_power);
	}
	
	public static int recPowerNumber(int number, int power) {
		if(power == 0) {
			return 1;
		}
		if(power == 1) {
			return number;
		}
		
		return number * recPowerNumber(number, (power-1));
	}
	public static void main(String[] args) {
		powNumber();
		//System.out.print(recPowerNumber(-4, 2));	
	}

}
