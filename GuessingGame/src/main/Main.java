package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int missing = random.nextInt(10)+1;
		int guess =0;
		int lives = 0;
		System.out.println("Guess the number!");
		System.out.println("you have 3 lives");
		
		
		for(int i=2; i>=lives; i--) {
				
			guess = scanner.nextInt();
				
			if(guess>missing) {
				System.out.println("Lower");
				System.out.println("Lives: "+i);
			}
				
			else if(guess<missing) {
				System.out.println("Higher");
				System.out.println("Lives: "+i);
			}
			
			else {
				System.out.println("Congratulations you guessed the right number "+missing);
			}
				
		}
		scanner.close();
		if(guess<missing || guess>missing) {
			System.out.println("You fail the game!" );
			System.out.println("The right number is "+missing);
		}
		
	}

}
