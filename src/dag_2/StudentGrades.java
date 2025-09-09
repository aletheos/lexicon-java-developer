package dag_2;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class StudentGrades {
	static String[] className = {
		"Mathematics",
		"Physics",
		"English",
		"Social Studies",
		"Physical Education"
	};
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		Scanner sc = new Scanner(in);

		for (int studentID = 0; ; ++studentID) {
			out.printf("Enter name of Student #%d, then press <Enter> when done: ", studentID);
			String studentName = sc.nextLine();
			if (studentName.isBlank()) { break; }
			students.addLast(studentName);
		}
		if(students.isEmpty()) { return; }
		int[][] grades = new int[students.size()][5];
		for (int studentID = 0; studentID < students.size(); ++studentID) {
			for (int classIndex = 0; classIndex < grades[studentID].length; ++classIndex) {
				out.printf("What is the grade assigned to %s in %s? ", students.get(studentID), className[classIndex]);
				grades[studentID][classIndex]=sc.nextInt();
			}
		}
	}
}
