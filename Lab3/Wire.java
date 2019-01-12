import edu.ac.guitarlib.Board;

public class Wire {

	public Board board;
	public int tension;

	public Wire(Board board) {

		this.board = board;
		tension = 0;

	}

	public void pluck() {
		System.out.println(tension);
		this.board.soundNote(tension);
	}

	// private void vibrate() {
	// this.board.soundNote(tension);
	// }

	public void changeTension(int deltaTension) {

		if (deltaTension == 0) {
			tension = 0;
		}

		tension += deltaTension;
	}

}