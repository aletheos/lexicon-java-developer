package dag_3.class_statistics;

import java.util.ArrayList;

public class ClassStatistics {
	final ArrayList<Student> students;

	public ClassStatistics(ArrayList<Student> students) {
		this.students = students;
	}

	public void run() {
		// Display average exam results
		// Display highest / lowest exam results
		// Display names of student with highest and lowest exam results
		// Sort students by exam results
		// List all students with higher than average exam results
		// Let user search for student name and show that student's exam results
		// Convert exam results to grades (A—F)
	}

	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println(arg);
		}

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Natdanai", 84));
		students.add(new Student("Sebastian", 76));
		students.add(new Student("Stefan", 100));
		students.add(new Student("Fanny", 92));
		students.add(new Student("Grodan Boll", 0));
		students.add(new Student("Robert'); DROP TABLE Students--", 0));
		students.add(new Student("<<INVALID_INPUT>>", 0xFFFFFFFF));
		students.add(new Student("Valentin", 96));

		ClassStatistics o = new ClassStatistics(students);
		o.run();
	}
}
