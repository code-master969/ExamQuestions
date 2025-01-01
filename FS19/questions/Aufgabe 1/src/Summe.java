public class Summe {

	public static Pair ohne7(int summe) {
		for(int i = 0; i <= summe/2 + 1; i++) {
			int first = i;
			int second = summe - first;
			String f = first.toString();
			String s = second.toString();
			if (!f.contains('7') && !s.contains('7')) {
				Pair p = new Pair();
				p.first = first;
				p.second = second;
				return p;
			}
		}
		
		
		return null;
	}
}
