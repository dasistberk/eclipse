package javaCampDay3;

public class Student extends User {

	private String studentNumber;
	private String schoolName;
	private String department;
	
	public Student( String studentNumber,String schoolName, String department) {
		this.studentNumber = studentNumber;
		this.schoolName = schoolName;
		this.department = department;
	}
	public Student() {
		
	}
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	

}
