
public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student student = new Student(1, "Esat", "ÖZMEN", 123456, "deneme@gmail.com", 100, 789456, 1);
		studentManager.join(student);
		studentManager.exit(student);
		
		
		InstructorManager instructorManager= new InstructorManager();
		Instructor instructor = new Instructor(2, "kazım", "koyuncu", 147258, "Kazım@gmail.com", 101, 456123, 2);
		instructorManager.login(instructor);
		instructorManager.exıt(instructor);
		
		User[] users = {student,instructor};
		
		UserManager userManager = new UserManager();
		userManager.add();
		userManager.Delete();
		
	
	
	
	}
		
	

}
