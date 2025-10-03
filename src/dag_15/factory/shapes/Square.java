package dag_15.factory.shapes;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.print(
			"""
			▄▄▄▄▄▄▄▄▄▄
			██████████
			██████████
			██████████
			▀▀▀▀▀▀▀▀▀▀
			"""
		);
	}
}
