package javaCampDay3;

public class User {
	private int id;
	private String fName;
	private String lName;
	private String birthDate;
	private String identityNumber;
	private String gender;
	private String email;
	private String detail;
	
	public User(int id, String fName, String lName,String birthDate, String identityNumber, String gender,String email,String detail) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.birthDate=birthDate;
		this.identityNumber = identityNumber;
		this.gender = gender;
		this.email=email;
		this.detail=detail;
	}
	
	public User() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
