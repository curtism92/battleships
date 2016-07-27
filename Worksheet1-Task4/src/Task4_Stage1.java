import javax.swing.JFrame;


public class Task4_Stage1 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("New game" + "\n");
		CreateBoard create = new CreateBoard();
		create.makeBoard();
		Player.HowManyPlayers();
		Ships place = new Ships();
		place.placeShipsOnBoard();
		Player player = new Player();
		player.playerMove();
	}
}
