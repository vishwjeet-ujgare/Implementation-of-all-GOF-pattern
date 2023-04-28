package gang_of_four.creational_patterns.Abstract_Factory_Patterns;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase("Square")) {
			return new RoundedSquare();
		}
		return null;
	}

}
