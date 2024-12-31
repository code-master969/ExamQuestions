<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;

public class CityBuilder {
	
	static City build() {
		// TODO
		City Zurich = new City();
		
		Square Sihlpost = new Square("Sihlpost");
		Square Bahnhofplatz = new Square("Bahnhofplatz");
		Square Loewenplatz = new Square("Loewenplatz");
		Square Stampfenbachplatz = new Square("Stampfenbachplatz");
		Square Central = new Square("Central");
		Square Polyterrasse = new Square("Polyterrasse");
		
		Intersection i1 = new Intersection();
		Intersection i2 = new Intersection();
		Intersection i3 = new Intersection();
		
		Street s1 = new Street(i1, Sihlpost, 6);
		Street s2 = new Street(Bahnhofplatz, i1, 5);
		Street s3 = new Street(Loewenplatz, Bahnhofplatz, 6);
		Street s4 = new Street(Bahnhofplatz, Stampfenbachplatz, 10);
		Street s5 = new Street(Stampfenbachplatz, Bahnhofplatz, 10);
		Street s6 = new Street(Bahnhofplatz, Central, 2);
		Street s7 = new Street(Central, Bahnhofplatz, 2);
		Street s8 = new Street(Central, Stampfenbachplatz, 9);
		Street s9 = new Street(Central, i2, 7);
		Street s10 = new Street(i2, Central, 7);
		Street s11 = new Street(i2, Polyterrasse, 8);
		Street s12 = new Street(Polyterrasse, i2, 8);
		Street s13 = new Street(Polyterrasse, i3, 3);
		
		i1.outgoingStreets.add(s1);
		i2.outgoingStreets.add(s10);
		i2.outgoingStreets.add(s11);
		Bahnhofplatz.outgoingStreets.add(s2);
		Bahnhofplatz.outgoingStreets.add(s4);
		Bahnhofplatz.outgoingStreets.add(s6);
		Loewenplatz.outgoingStreets.add(s3);
		Stampfenbachplatz.outgoingStreets.add(s5);
		Central.outgoingStreets.add(s7);
		Central.outgoingStreets.add(s8);
		Central.outgoingStreets.add(s9);
		Polyterrasse.outgoingStreets.add(s12);
		Polyterrasse.outgoingStreets.add(s13);
		
		Zurich.intersections.add(Sihlpost);
		Zurich.intersections.add(Bahnhofplatz);
		Zurich.intersections.add(Loewenplatz);
		Zurich.intersections.add(Stampfenbachplatz);
		Zurich.intersections.add(Central);
		Zurich.intersections.add(Polyterrasse);
		Zurich.intersections.add(i1);
		Zurich.intersections.add(i2);
		Zurich.intersections.add(i3);
		
		Zurich.streets.add(s1);
		Zurich.streets.add(s2);
		Zurich.streets.add(s3);
		Zurich.streets.add(s4);
		Zurich.streets.add(s5);
		Zurich.streets.add(s6);
		Zurich.streets.add(s7);
		Zurich.streets.add(s8);
		Zurich.streets.add(s9);
		Zurich.streets.add(s10);
		Zurich.streets.add(s11);
		Zurich.streets.add(s12);
		Zurich.streets.add(s13);
		
		return Zurich;
=======
public class CityBuilder {
	
	static City build() {
		// TODO
		return null;
>>>>>>> branch 'main' of https://github.com/code-master969/ExamQuestions.git
	}
}
