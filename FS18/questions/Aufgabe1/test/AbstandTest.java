<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
=======
import static org.junit.Assert.*;
>>>>>>> branch 'main' of https://github.com/code-master969/ExamQuestions.git

import org.junit.Test;

public class AbstandTest {
	
	@Test
	public void testAbstandSimple() {
		assertEquals(18, Abstand.abstand(new int[] {1,-2,0,3}, new int[] {1,4,-5,3,7}));
	}
}
