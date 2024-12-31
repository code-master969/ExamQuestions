<<<<<<< HEAD
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class City {
	
	Set<Street> streets = new HashSet<>();
	Set<Intersection> intersections = new HashSet<>();
	
	City() {}
	
	Set<Street> deadEnds() {
		// TODO
		Set<Intersection> sackgasse = new HashSet<>();
		for (Intersection i : intersections) {
			if (i.outgoingStreets.size() == 0) {
				sackgasse.add(i);
			}
		}
		
		for (int k = 0; k < intersections.size(); k++) {
			for (Intersection i : intersections) {
				int counter = 0;
				for (Street st : i.outgoingStreets) {
					if (sackgasse.contains(st.to) || !intersections.contains(st.to)) {
						counter++;
					}
				}
				if (counter == i.outgoingStreets.size()) {
					sackgasse.add(i);
				}
			}
		}
		Set<Street> deadEndsStreets = new HashSet<>(); 
		for (Street st : streets) {
			if (sackgasse.contains(st.to) || !intersections.contains(st.to)) {
				deadEndsStreets.add(st);
			}
		}
		
		return deadEndsStreets;
	}
	
	Set<Square> reachableSquares(String squareName, int distance) {
		// TODO
		if (distance < 0) {
			throw new IllegalArgumentException("Distance to small");
		}
		Map<Intersection, Integer> d = new HashMap<>();
		Intersection start = get(squareName);
		
		for (Intersection i : intersections) {
			d.put(i, 1000000000);
		}
		d.put(start, 0);
		
		Set<Square> result = new HashSet<>();
		result.add((Square) start);
		for (int t = 0; t < intersections.size(); t++) {
			for (Street st : streets) {
				d.put(st.to, Math.min(d.get(st.to), d.get(st.from) + st.length));
				if (st.to instanceof Square && d.get(st.to) <= distance) {
					result.add((Square) st.to);
				}
			}
		}
		
		System.out.println(result);
		return result;
	}
	
	private Intersection get(String squareName) {
		for (Intersection i : intersections) {
			if (i instanceof Square && ((Square) i).name.equals(squareName)) {
				return i;
			}
		}
		throw new IllegalArgumentException("Not a Square");
=======
import java.util.HashSet;
import java.util.Set;

public class City {
	
	Set<Street> streets = new HashSet<>();
	Set<Intersection> intersections = new HashSet<>();
	
	City() {}
	
	Set<Street> deadEnds() {
		// TODO
		return null;
	}
	
	Set<Square> reachableSquares(String squareName, int distance) {
		// TODO
		return null;
>>>>>>> branch 'main' of https://github.com/code-master969/ExamQuestions.git
	}
}
