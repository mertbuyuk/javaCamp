package assignment2;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();	
		Student student = new Student();
		student.setFirstName("Mert");
		student.setLastName("kılıç.");
		userManager.add(student);
		Instructor instructor = new Instructor();
		instructor.setFirstName("sinan");
		instructor.setLastName("keser");
		userManager.update(instructor);
		
		Course a = new Course(1, "a");
		Course b = new Course(2, "b");
		Course c = new Course(3, "x");
		Course d = new Course(4, "s");
		
		Course[] courses = {a,b,c,d};
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(courses);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.openCourse(b);
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student, b);
		
	}

}
