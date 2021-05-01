
public class Instructor extends User {
	private int ýdentityNumber;
	private int password;
	public Instructor(int id, String fistName, String lastName, int password, String email, int userId,
			int identityNumber, int password2) {
		super(id, fistName, lastName, password, email, userId);
		ýdentityNumber = identityNumber;
		password = password2;
	}
	public int getIdentityNumber() {
		return ýdentityNumber;
	}
	public void setIdentityNumber(int identityNumber) {
		ýdentityNumber = identityNumber;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	

	

}
