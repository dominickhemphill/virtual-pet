
import java.util.Scanner;

public class virtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet myPet = new VirtualPet(10, 10, 10, 10);
		

		
		System.out.println("Yay!  Your grandma gave you a boring flower!!!");
		System.out.println("Let's try not to kill this one, ok?");
		System.out.println("What would you like to do?");
		System.out.println("Press:1 To water your plant. ");
		System.out.println("Press:2 To feed your plant. ");
		System.out.println("Press:3 To give your plant sunlight. ");
		System.out.println("Press:4 To give your plant attention. ");
		
		
		String userOption;
		while (myPet.myPlantLives()) {
		do {
				userOption = input.next();
		}while (!userOption.equals("1") && !userOption.equals("2") && !userOption.equals("3")
					&& !userOption.equals("4"));
			
		
		switch (userOption) {
			case "1":
				myPet.water();
				myPet.tick();
				if (myPet.myPlantLives() == true) {
					System.out.println("You gave water to the plant, I think it's starting to grow...");	
				}
				break;
			case "2":
				myPet.feed();
				myPet.tick();
				if (myPet.myPlantLives() == true) {
					System.out.println("You fed the plant, it looks so healthy!");	
				}
				break;
			case "3":
				myPet.sunlight();
				myPet.tick();
				if (myPet.myPlantLives() == true) {
					System.out.println("You gave the plant sunlight, I think the petals are opening!");
				}
				break;
			case "4":
				myPet.attention();
				myPet.tick();
				if (myPet.myPlantLives() == true) {
					System.out.println("You trimmed and nurtured the plant.  Does it sound like it's singing to you?");	
				
				break;
			}
		
			
			if (myPet.myPlantLives() == false) {
			System.out.println
					("You've killed the flower again!  Dude, grandma's going to be pissed. ");
			System.exit(0);
		}
			input.close();
		
		}
}}}
		
	
