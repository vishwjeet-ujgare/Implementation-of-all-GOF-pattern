package gang_of_four.creational_patterns.Abstract_Factory_Patterns;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean isRounded){   
	      if(isRounded){
	         return new RoundedShapeFactory();         
	      }else{
	         return new NormalShapeFactory();
	      }
	   }
}
