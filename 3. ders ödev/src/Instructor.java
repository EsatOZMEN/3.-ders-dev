
public class Instructor extends User {
	private int ędentityNumber;
	private int password;
	
	public Instructor(int id, String fistName, String lastName, int password, String email, int userId,
			int identityNumber, int password2) {
		super(id, fistName, lastName, password, email, userId);
		ędentityNumber = identityNumber;
		password = password2;
	}
	public int getIdentityNumber() {
		return ędentityNumber;
	}
	public void setIdentityNumber(int identityNumber) {
		ędentityNumber = identityNumber;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	

	

}
