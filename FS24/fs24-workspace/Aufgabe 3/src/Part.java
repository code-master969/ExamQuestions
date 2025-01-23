public class Part implements Component {

	@Override
	public void process(Cost c) {
		// Ein generischer Part hat keine process() Semantik
	}

}


class Fluegeltueren extends Part {
	
}

class Fluxkompensator extends Part {
	
}

class Schwebeumwandlung extends Part {
	
}

class EinklappbareRaeder extends Part {
	
}

class OutatimeKennzeichen extends Part {
	
}

//erst relevant in Teil (b)
class FirstEditionFluxkompensator extends Part {
	
}

//erst relevant in Teil (b)
class VerchromteRaeder extends Part {
	
}
