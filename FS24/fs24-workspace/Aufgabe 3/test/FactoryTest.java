import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class FactoryTest {

	@Test
	void testSimpleBuild() {
		Cost c = Factory.computeCost(List.of(
			new EinklappbareRaeder(), 
			new Fluxkompensator()
		));

		assertEquals(14000, c.productionCost);
		assertEquals(7 * 7000 / 100 + 7 * 7000 / 100, c.vat);
	}

	@Test
	void testDoubleCompensator() {
		Cost c = Factory.computeCost(List.of(
			new EinklappbareRaeder(), 
			new Schwebeumwandlung(), 
			new Schwebeumwandlung()
		));

		assertEquals(((7000 * 120) / 100) * 120 / 100, c.productionCost);
		assertEquals(7 * 7000 / 100 + (20 * 7000 / 100) * 10 / 100 + (20 * (7000 * 120 / 100) / 100) * 10 / 100, c.vat);
	}

	@Test
	void testDoubleFluegeltueren() {
		Cost c = Factory.computeCost(List.of(
			new EinklappbareRaeder(), 
			new Fluegeltueren(), 
			new Fluegeltueren()
		));

		assertEquals(7000 + 2000 + 2000, c.productionCost);
		assertEquals(7 * 7000 / 100 + 3 * 2000 / 100 + 3 * 2000 / 100, c.vat);
	}

	@Test
	void testExtraTax() {
		Cost c = Factory.computeCost(List.of(
			new Fluegeltueren(), 
			new FirstEditionFluxkompensator()
		));

		assertEquals(4000, c.productionCost);
		assertEquals(2000 * 3 / 100 + 2000 * 7 / 100, c.vat);
		assertEquals(4000 * 5 / 100, c.luxuryTax);
	}

	@Test
	void testIllegalConfiguration() {
		assertThrows(IllegalArgumentException.class, () -> {
			Factory.computeCost(List.of(
				new Fluxkompensator(), 
				new Fluxkompensator()
			));
		});
	}
}
