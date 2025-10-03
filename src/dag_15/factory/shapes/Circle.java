package dag_15.factory.shapes;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.print(
			"""
			   ▄▄▄
			 ███████
			█████████
			█████████
			 ███████
			   ▀▀▀
			"""
		);
	}
}
