
public class Student extends User {
	
	private int studentNumber;
	private int numverOfCamps;
	
	public Student(int id, String fistName, String lastName, int password, String email, int userId, int studentNumber,
			int numverOfCamps) {
		super(id, fistName, lastName, password, email, userId);
		this.studentNumber = studentNumber;
		this.numverOfCamps = numverOfCamps;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getNumverOfCamps() {
		return numverOfCamps;
	}

	public void setNumverOfCamps(int numverOfCamps) {
		this.numverOfCamps = numverOfCamps;
	}

}
