package dag_15.factory;

import dag_15.factory.factories.MalformedShapeException;
import dag_15.factory.factories.ShapeFactory;
import dag_15.factory.shapes.Shape;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();;
		try {
			shapes.add(ShapeFactory.createShape("C"));
			shapes.add(ShapeFactory.createShape("Triangle"));
			shapes.add(ShapeFactory.createShape("Rect"));
			shapes.add(ShapeFactory.createShape("f"));
			shapes.add(ShapeFactory.createShape("circle"));
			shapes.add(ShapeFactory.createShape("r"));
			shapes.add(ShapeFactory.createShape("sq"));
		} catch (MalformedShapeException e) {
			System.err.println(e.getMessage());
		}
		for (var shape : shapes) {
			shape.draw();
		}
	}
}
