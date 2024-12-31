<<<<<<< HEAD
import java.util.List;
import java.util.ArrayList;

public class Kombinationen {
	
//	public static String generate(String input) {
//		// TODO
//		String output = "\"\"";
//		int l = input.length();
//		
//		output = str(input, output);
//		for (int i = 1; i < l - 1; i++) {
//			input = input.substring(0, i) + input.substring(i + 1, input.length());
//			output = str(input, output);
//		}
//
//		return output;
//	}
//	
//	public static String str(String input, String output) {
//		for (int i = 0; i < input.length(); i++) {
//			for (int j = i; j < input.length(); j++) {
//				if (!output.contains("\"" + input.substring(i, j+1))) {
//					output = output + " \"" + input.substring(i, j+1) + "\"";
//				}
//			}
//		}
//		return output;
//	}
	
	public static String generate(String input) {
		return rec("", input, "");
	}
	
	public static String rec (String res, String curr, String path) {
		if (curr.length() == 0) {
			return res + "\"" + path + "\" ";
		}
		else {
			res = rec(res, curr.substring(1), path + curr.charAt(0));
			res = rec(res, curr.substring(1), path);
		}
		return res;
	}
	
=======
public class Kombinationen {
	
	public static String generate(String input) {
		// TODO
		return null;
	}
>>>>>>> branch 'main' of https://github.com/code-master969/ExamQuestions.git
}
