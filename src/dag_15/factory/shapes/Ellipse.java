package dag_15.factory.shapes;

public class Ellipse implements Shape {
	@Override
	public void draw() {
		System.out.print(
			"""
			       ▄▄▄
			  █████████████
			█████████████████
			█████████████████
			  █████████████
			       ▀▀▀
			"""
		);
	}
}
