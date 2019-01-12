
public class Peg {

	public Wire wires;

	public Peg(Wire wires) {
		this.wires = wires;

	}

	public void turn(int deltaTension) {
		wires.changeTension(deltaTension);
	}

}