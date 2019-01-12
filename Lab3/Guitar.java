import edu.ac.guitarlib.*;

public class Guitar {

	public static Board board;
	public Wire[] w;
	public Peg[] p;

	public Guitar() {

		board = new Board();
		w = new Wire[6];
		p = new Peg[6];

		for (int i = 0; i < w.length; i++) {
			w[i] = new Wire(board);
			p[i] = new Peg(w[i]);
			p[i].turn(Midi.GUITAR_TABLE[i]);

		}

	}

	public void pluck(int wireNum) {
		w[wireNum - 1].pluck();

		System.out.println("Wirenum - " + wireNum);
	}

	public void turn(int pegNum, int deltaTension) {
		p[pegNum - 1].turn(deltaTension); // turn(pegNum, tension);
	}

}
