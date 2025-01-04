import java.io.*;
import java.util.*;

public class SeqAnalyzer {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputSequence = new Scanner("1 3 2 9 2 45");
		SeqAnalyzer analyzer = new SeqAnalyzer(inputSequence);

		List<SeqNumber> seqNumbers = analyzer.getNumbers();
		
		for (SeqNumber seqNumber : seqNumbers) {
			System.out.println(seqNumber);
		}
	}

	public SeqAnalyzer(Scanner scanner) {
		// TODO
	}
	
	public List<SeqNumber> getNumbers() {
		//TODO
		return null;
	}

	public List<SeqNumber> getRanking(int number) {
		// TODO
		return null;
	}
}
