import java.util.Scanner;

public class Player {

	public static void HowManyPlayers() {
		System.out.println("Choose how many players you want (1/2):");
		Scanner enterAmountOfPlayers = new Scanner(System.in);
		int amountOfPlayers = enterAmountOfPlayers.nextInt();
		if (amountOfPlayers == 1 || amountOfPlayers == 2) {

		} else {
			System.out.println("Wrong amount of players please enter again");
			HowManyPlayers();
		}
	}

	public static void playerMove() {
		System.out.println("Begin game" + "\n" + "Player " + " take your turn");

		boolean gameEnd;

		for(int i = 0; i < 144; i++){
		//do {
			System.out.println("Enter your X coordinate (As a letter A-L): ");
			Scanner enterXCoordinates = new Scanner(System.in);
			String xCoordinates = enterXCoordinates.next();

			if (xCoordinates.equals("A") || xCoordinates.equals("a")
					|| xCoordinates.equals("B") || xCoordinates.equals("b")
					|| xCoordinates.equals("C") || xCoordinates.equals("c")
					|| xCoordinates.equals("D") || xCoordinates.equals("d")
					|| xCoordinates.equals("E") || xCoordinates.equals("e")
					|| xCoordinates.equals("F") || xCoordinates.equals("f")
					|| xCoordinates.equals("G") || xCoordinates.equals("g")
					|| xCoordinates.equals("H") || xCoordinates.equals("h")
					|| xCoordinates.equals("I") || xCoordinates.equals("i")
					|| xCoordinates.equals("J") || xCoordinates.equals("j")
					|| xCoordinates.equals("K") || xCoordinates.equals("k")
					|| xCoordinates.equals("L") || xCoordinates.equals("l")) {

			} else {
				System.out.println("Invalid valud please enter a correct value"
						+ "\n");
				playerMove();
			}

			System.out.println("Enter your Y coordinate (As a number 1-12): ");
			Scanner enterYCoordinates = new Scanner(System.in);
			String yCoordinates = enterYCoordinates.next();

			if (yCoordinates.equals("1") || yCoordinates.equals("2")
					|| yCoordinates.equals("3") || yCoordinates.equals("4")
					|| yCoordinates.equals("5") || yCoordinates.equals("6")
					|| yCoordinates.equals("7") || yCoordinates.equals("8")
					|| yCoordinates.equals("9") || yCoordinates.equals("10")
					|| yCoordinates.equals("11") || yCoordinates.equals("12")) {

			} else {
				System.out.println("Invlaid value please start again" + "\n");
				playerMove();
			}
			if(gameEnd = false){
				break;
			}
			
			
	//	} while (gameEnd = false);
		}
	}

	public static void hasHit(String xCoordinates, String yCoordinates) {
		Boolean hit = true;
		if (hit) {
			// xCoordinates && yCoordinates;
			System.out.println("You sunk my battleship!");
		}
	}

}