import java.util.Scanner;


public class CalorieWatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

	int cookiesEaten;
	double servingsConsumed;
	double totalCalories;
	System.out.println("Enter the number of cookies you ate");
	cookiesEaten = kb.nextInt();
	
	if (cookiesEaten < 0 || cookiesEaten > 40) {
		System.out.println("Invalid number of cookies. Enter a number between 0 and 40");
		}
	else {
		servingsConsumed = (double) cookiesEaten/ 40 * 10;
		totalCalories = servingsConsumed * 300;
		
		System.out.println("You consumed " + totalCalories + " calories when you ate " + cookiesEaten + " cookies. ");
	}
	
	
	
	}

}
