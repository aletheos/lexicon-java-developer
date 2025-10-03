package dag_15.factory.shapes;

public class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.print(
			"""
			 █████████
			  ███████
			   █████
			    ███
			     █
			"""
		);
	}
}
