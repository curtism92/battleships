import java.util.Scanner;

public class PatrolShip {

	public void PlacePatrolShip() {

		int[] patrol1 = new int[2];
		for (int i = 0; i < patrol1.length; i++) {
			System.out.println("Enter your X coordinate (As a letter A-L): ");
			Scanner enterShipXCoordinates = new Scanner(System.in);
			String xShipCoordinates = enterShipXCoordinates.next();

			if (xShipCoordinates.equals("A") || xShipCoordinates.equals("a")
					|| xShipCoordinates.equals("B")
					|| xShipCoordinates.equals("b")
					|| xShipCoordinates.equals("C")
					|| xShipCoordinates.equals("c")
					|| xShipCoordinates.equals("D")
					|| xShipCoordinates.equals("d")
					|| xShipCoordinates.equals("E")
					|| xShipCoordinates.equals("e")
					|| xShipCoordinates.equals("F")
					|| xShipCoordinates.equals("f")
					|| xShipCoordinates.equals("G")
					|| xShipCoordinates.equals("g")
					|| xShipCoordinates.equals("H")
					|| xShipCoordinates.equals("h")
					|| xShipCoordinates.equals("I")
					|| xShipCoordinates.equals("i")
					|| xShipCoordinates.equals("J")
					|| xShipCoordinates.equals("j")
					|| xShipCoordinates.equals("K")
					|| xShipCoordinates.equals("k")
					|| xShipCoordinates.equals("L")
					|| xShipCoordinates.equals("l")) {

			} else {
				System.out.println("Invalid value please start again" + "\n");
				// placeShipsOnBoard();
			}

			System.out.println("Enter your Y coordinate (As a number 1-12): ");
			Scanner enterShipYCoordinates = new Scanner(System.in);
			String yShipCoordinates = enterShipYCoordinates.next();

			if (yShipCoordinates.equals("1") || yShipCoordinates.equals("2")
					|| yShipCoordinates.equals("3")
					|| yShipCoordinates.equals("4")
					|| yShipCoordinates.equals("5")
					|| yShipCoordinates.equals("6")
					|| yShipCoordinates.equals("7")
					|| yShipCoordinates.equals("8")
					|| yShipCoordinates.equals("9")
					|| yShipCoordinates.equals("10")
					|| yShipCoordinates.equals("11")
					|| yShipCoordinates.equals("12")) {

			} else {
				System.out.println("Invlaid value please start again" + "\n");
				// placeShipsOnBoard();
			}
		}

		CreateBoard create = new CreateBoard();
		create.makeBoard();
	}

}
