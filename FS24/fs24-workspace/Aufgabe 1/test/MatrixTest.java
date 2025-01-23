import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MatrixTest {

	@Test
	public void testCountAssimilated1() {
		int[][] input = new int[][]{{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
		int result = Matrix.countAssimilated(input);
		
		assertEquals(9, result);
	}

	@Test
	public void testCountAssimilated2() {
		int[][] input = new int[][]{{5, 10, 3}, {6, 9, 6}, {3, 3, 15}};
		int result = Matrix.countAssimilated(input);
		
		assertEquals(4, result);
	}

	@Test
	public void testCountAssimilated3() {
		int[][] input = new int[][]{{4, 7, 13}, {-2, -12, 32}, {20, 15, -8}, {17, 3, 1111}};
		int result = Matrix.countAssimilated(input);
		
		assertEquals(3, result);
	}

	@Test
	public void testCountAssimilated4() {
		int[][] input = new int[][]{{1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30}};
		int result = Matrix.countAssimilated(input);
		
		assertEquals(15, result);
	}

}
