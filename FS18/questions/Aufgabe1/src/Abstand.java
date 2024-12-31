import java.util.Arrays;
public class Abstand {
	
	public static int abstand(int[] ns, int[] ms) {
		// TODO
		if (ns.length == 0 && ms.length == 0) {
			return 0;
		}
		
		int l = Math.max(ns.length, ms.length);
		int sum = 0;
		for (int i = 0; i < l; i++) {
			int n = 0;
			if (i < ns.length) {
				n = ns[i];
			}
			
			int m = 0;
			if (i < ms.length) {
				m = ms[i];
			}
			
			sum += Math.abs((m-n));
		}
		
		return sum;
}