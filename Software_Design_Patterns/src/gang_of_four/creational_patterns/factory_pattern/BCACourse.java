package gang_of_four.creational_patterns.factory_pattern;

public class BCACourse implements Course {

	@Override
	public String getCouseName() {
		// TODO Auto-generated method stub
		return "BCA";
	}

	@Override
	public int getCouseDuration() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String getCourseHOD() {
		// TODO Auto-generated method stub
		return "Prof.Pratap Patil";
	}

}
