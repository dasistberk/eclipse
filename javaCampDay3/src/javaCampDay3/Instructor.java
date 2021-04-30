package javaCampDay3;

public class Instructor extends User {
	
	private String instructorNumber;
	
	public Instructor(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	
	public Instructor() {
		
	}
	
	public String getInstructorNumber() {
		return instructorNumber;
	}
	
	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
}
	
