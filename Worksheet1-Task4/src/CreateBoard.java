import java.util.Scanner;

public class CreateBoard {

	public static void makeBoard() {
		char[][] grid = new char[12][12];
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		
		System.out.println("  A   B   C   D   E   F   G   H   I   J   K   L  ");
		System.out.println("________________________________________________");
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				//System.out.println("Please enter your ["+i+"]["+j+"] coordinate for boat 1: ");
				grid[i][j] = '|';
				System.out.print(grid[i][j] + "_" + "_" + "_");
			}
			System.out.println(" ");
		}
		System.out.println("  A   B   C   D   E   F   G   H   I   J   K   L  "
				+ "\n");
	}
}
