
public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student student = new Student(1, "Esat", "�ZMEN", 123456, "deneme@gmail.com", 100, 789456, 1);
		studentManager.join(student);
		studentManager.exit(student);
		
		
		InstructorManager instructorManager= new InstructorManager();
		Instructor instructor = new Instructor(2, "kaz�m", "koyuncu", 147258, "Kaz�m@gmail.com", 101, 456123, 2);
		instructorManager.login(instructor);
		instructorManager.ex�t(instructor);
		
		User[] users = {student,instructor};
		
		UserManager userManager = new UserManager();
		userManager.add();
		userManager.Delete();
		
	
	
	
	}
		
	

}
