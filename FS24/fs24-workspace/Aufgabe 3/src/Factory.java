import java.util.List;

public class Factory {
	/*  Zur Erinnerung:
	 *   Sie duerfern die Anweisungen der Methode computeCost aendern aber nicht die Parameterliste oder den Rueckgabewert
	 *   Wenn es keine public static Methode mit diesem Namen und Rueckgabewert gibt, erhalten Sie 0 Punkte
	 *   Sie duerfen in diese Klasse weitere Methoden hinzufuegen
	 */
	public static Cost computeCost(List<Component> steps) {
		Cost c = new Cost();
		
		for (Component s : steps) {
			s.process(c);
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		Cost c = Factory.computeCost(List.of(
				new EinklappbareRaeder(), 
				new Fluxkompensator()
			));
		System.out.println("Die Kosten betragen sich auf " + c.productionCost + " (MWst " + c.vat + ", Luxus-Steuer " + c.luxuryTax + ")");
	}
}
