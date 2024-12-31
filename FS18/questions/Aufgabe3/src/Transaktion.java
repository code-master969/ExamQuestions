import java.util.Comparator;

public class Transaktion implements Comparable<Transaktion>{
	String pName;
	String kName;
	int anzahl;
	double preis;
	
	@Override
	public int compareTo(Transaktion other) {
		return Double.compare(this.anzahl*this.preis, other.anzahl*other.preis);
	}
	
	public class Comparators {
		public static Comparator<Transaktion> preis = new Comparator<Transaktion>() {
			@Override
			public int compare(Transaktion t1, Transaktion t2) {
				return Double.compare(t1.preis, t2.preis);
			}
		};
	}

}
