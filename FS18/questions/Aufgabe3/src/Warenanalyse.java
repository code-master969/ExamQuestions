import java.io.File;
import java.io.FileNotFoundException;
<<<<<<< HEAD
import java.io.PrintStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Warenanalyse {
	
	static void analyse(File input, File output) throws FileNotFoundException {
		// TODO
		List<Transaktion> list = new LinkedList<Transaktion>();
		Scanner sc = new Scanner(input);
		while (sc.hasNextLine()) {
			Transaktion t = new Transaktion();
			t.pName = sc.next();
			t.kName = sc.next();
			t.anzahl = sc.nextInt();
			t.preis = sc.nextDouble();
			list.add(t);
		}
		sc.close();
		
		Transaktion exc1 = Collections.max(list);
		
		Map<String, Double> m2 = new HashMap<>(); 
		for (Transaktion t : list) {
			m2.put(t.kName, m2.getOrDefault(t.kName, 0.0) + t.anzahl*t.preis);
		}
		Double maxSumme = Collections.max(m2.values());
		String exc2 = null;
		for (Map.Entry<String, Double> entry : m2.entrySet()) {
			if (entry.getValue() == maxSumme) {
				exc2 = entry.getKey();
				break;
			}
		}
		
		Map<String, Double> m3min = new HashMap<>();
		Map<String, Double> m3max = new HashMap<>();
		for (Transaktion t : list) {
			if (m3min.containsKey(t.pName)) {
				if (t.preis > m3max.get(t.pName)) {
					m3max.put(t.pName, t.preis);
				} else if (t.preis < m3min.get(t.pName)) {
					m3min.put(t.pName, t.preis);
				}
			} else {
				m3max.put(t.pName, t.preis);
				m3min.put(t.pName, t.preis);
			}
		}
		String exc3 = null;
		Double max = 0.0;
		for (Map.Entry<String, Double> entry : m3min.entrySet()) {
			Double d = m3max.get(entry.getKey()) - entry.getValue();
			if (d >= max) {
				exc3 = entry.getKey();
				max = d;
			}
		}
		
		String outcome = exc1.pName + " " + exc1.preis + "\n" + exc2 + " " + m2.get(exc2) + "\n" + exc3;
		System.out.print(outcome);
		PrintStream out = new PrintStream(output);
		out.print(outcome);
=======

public class Warenanalyse {
	
	static void analyse(File input, File output) throws FileNotFoundException {
		// TODO
>>>>>>> branch 'main' of https://github.com/code-master969/ExamQuestions.git
	}
}
