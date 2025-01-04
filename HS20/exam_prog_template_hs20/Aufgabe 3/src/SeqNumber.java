import java.util.*;

public class SeqNumber {

	private int number;
	private Set<Integer> positions;

	public SeqNumber(int number, Set<Integer> positions) {
		this.number = number;
		this.positions = positions;
	}

	public int getNumber() {
		return number;
	}

	public Set<Integer> getPositions() {
		return new HashSet<Integer>(positions);
	}

	@Override
	public String toString() {
		return number + ": " + positions.toString();
	}
}
