
public class StudentManager {
	public void join(Student student) {
		System.out.println("��renci Giri� Yapt :  "+student.getFistName()+student.getEmail()+student.getPassword());
		
	}
	public void exit(Student student) {
		System.out.println("��renci ��k�� Yapt� :"+student.getFistName()+student.getEmail()+student.getPassword());
	}
}
