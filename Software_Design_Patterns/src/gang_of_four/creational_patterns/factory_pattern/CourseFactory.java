package gang_of_four.creational_patterns.factory_pattern;

public class CourseFactory {

	public static Course getCourseObject(String dep)
	{
		if(dep.equalsIgnoreCase("MCA")) {
			return new MCACourse();			
		}
		else if (dep.equalsIgnoreCase("BCA"))
		{
			return new BCACourse();
		}
		else
		{
			throw new IllegalArgumentException("Invalid course type: " + dep);
		}
	}
}
