public class GradeConverter {
	public static void main(String[] args) {
		double score = Double.parseDouble(args[0]);
		if (score < 0 || score > 100) {
			throw new IllegalArgumentException(
				String.format("Invalid input: score is %s, but must be in range 0.0—100.0", score)
			);
		}
		char grade;
		if (score >= 90)        { grade = 'A'; }
		else if ( score >= 80 ) { grade = 'B'; }
		else if ( score >= 70 ) { grade = 'C'; }
		else if ( score >= 60 ) { grade = 'D'; }
		else                    { grade = 'F'; }
		System.out.println(grade);
	}
}
