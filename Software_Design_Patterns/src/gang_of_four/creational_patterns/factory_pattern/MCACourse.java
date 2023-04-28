package gang_of_four.creational_patterns.factory_pattern;

public class MCACourse implements Course {

	@Override
	public String getCouseName() {
		// TODO Auto-generated method stub
		return "MCA";
	}

	@Override
	public int getCouseDuration() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getCourseHOD() {
		// TODO Auto-generated method stub
		return "Prof.Swayam Shaha";
	}

}
