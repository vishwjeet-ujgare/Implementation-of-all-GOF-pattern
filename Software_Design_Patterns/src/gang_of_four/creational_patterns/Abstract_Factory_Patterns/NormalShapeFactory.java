package gang_of_four.creational_patterns.Abstract_Factory_Patterns;

public class NormalShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		 if(shapeType.equalsIgnoreCase("Rectangle")){
	         return new Rectangle();         
	      }else if(shapeType.equalsIgnoreCase("Square")){
	         return new Square();
	      }	 
	      return null;

	}

}
