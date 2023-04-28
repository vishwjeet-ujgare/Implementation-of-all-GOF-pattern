package gang_of_four.creational_patterns.factory_pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course bca = CourseFactory.getCourseObject("BCA");
		System.out.println("Course Name : " + bca.getCouseName());
		System.out.println("Course Name : " + bca.getCouseDuration());
		System.out.println("Course Name : " + bca.getCourseHOD());
		
		System.out.println("----------------------------------------");

		Course mca = CourseFactory.getCourseObject("MCA");
		System.out.println("Course Name : " + mca.getCouseName());
		System.out.println("Course Name : " + mca.getCouseDuration());
		System.out.println("Course Name : " + mca.getCourseHOD());
	}

}
