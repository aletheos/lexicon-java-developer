package dag_15.factory.factories;

import dag_15.factory.shapes.*;

public class ShapeFactory {
	public static Shape createShape(String type) {
		return switch (type.toUpperCase()) {
			case "CIRCLE", "C" -> new Circle();
			case "ELLIPSE", "E" -> new Ellipse();
			case "SQUARE", "SQ", "S" -> new Square();
			case "RECTANGLE", "RECT", "R" -> new Rectangle();
			case "TRIANGLE", "TRI", "T" -> new Triangle();
			default -> throw new MalformedShapeException(
				String.format(
					"Invalid shape: %s! Valid shapes are (C)ircle, (E)llipse, (S)quare, (R)ectangle, and (T)riangle.",
					type
				)
			);
		};
	}
}
