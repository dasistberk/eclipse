package javaCampDay3;

public class InstructorManager {
	public void addStudent(Instructor instructor1) {
		System.out.println("Dear " + instructor1.getfName() + " you have successfully completed the addition of students.");
	}
	public void updateStudent(Instructor instructor2) {
		System.out.println("Dear " + instructor2.getfName() + " you have successfully completed the student update process.");
	}
	public void removeStudent(Instructor instructor3) {
		System.out.println("Dear " + instructor3.getfName() + " you have successfully completed the removal process.");
	}
	
}
