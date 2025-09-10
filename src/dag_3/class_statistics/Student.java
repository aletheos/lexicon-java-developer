package dag_3.class_statistics;

public class Student {
	private final String name;
	private int examResult;

	public Student(String name, int examResult) {
		this.name = name;
		this.examResult = examResult;
	}

	public String getName() {
		return name;
	}

	public int getExamResult() {
		return examResult;
	}

	public void setExamResult(int examResult) {
		this.examResult = examResult;
	}
}
