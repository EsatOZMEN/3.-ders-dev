
public class User {
	private int	 id;
	private String fistName;
	private String lastName;
	private String Email;
	private int UserId;
	private int password;
	public User(int id, String fistName, String lastName, int password, String email, int userId) {
		super();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		Email = email;
		UserId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	

}
