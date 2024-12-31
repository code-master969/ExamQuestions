public class Street {
	
	Intersection from;
	Intersection to;
	int length;
	
	Street() {}
	
<<<<<<< HEAD
	Street(Intersection from, Intersection to, int length) {
		this.from = from;
		this.to = to;
		this.length = length;
	}
	
=======
>>>>>>> branch 'main' of https://github.com/code-master969/ExamQuestions.git
	@Override
	public String toString() {
		String line = "";
		for (int i = 0; i < length; i++) {
			line += "-";
		}
		return from + " " + line + " " + to;
	}
}
