package dag_15.factory;

import dag_15.factory.factories.MalformedShapeException;
import dag_15.factory.factories.ShapeFactory;
import dag_15.factory.shapes.Shape;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		ArrayList<Shape> shapes;
		try {
			shapes = new ArrayList<>();
			shapes.add(factory.createShape("C"));
			shapes.add(factory.createShape("Triangle"));
			shapes.add(factory.createShape("Rect"));
			shapes.add(factory.createShape("e"));
			shapes.add(factory.createShape("circle"));
			shapes.add(factory.createShape("r"));
			shapes.add(factory.createShape("sq"));
		} catch (MalformedShapeException e) {
			throw new RuntimeException(e);
		}
		for (var shape : shapes) {
			shape.draw();
		}
	}
}
