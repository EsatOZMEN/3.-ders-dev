
public class StudentManager {
	public void join(Student student) {
		System.out.println("Öğrenci Giriş Yapt :  "+student.getFistName()+student.getEmail()+student.getPassword());
		
	}
	public void exit(Student student) {
		System.out.println("Öğrenci Çıkış Yaptı :"+student.getFistName()+student.getEmail()+student.getPassword());
	}
}
