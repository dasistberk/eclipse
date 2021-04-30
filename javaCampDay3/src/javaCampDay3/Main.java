package javaCampDay3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setfName("Kerim");
		instructor1.setlName("Sekilli");
		instructor1.setBirthDate("05.08.2000");
		instructor1.setGender("Male");
		instructor1.setId(1);
		instructor1.setEmail("Kerim@yahoo.com");
		instructor1.setIdentityNumber("52345727");
		instructor1.setInstructorNumber("975");
		instructor1.setDetail("He knows the field of web design very well and has 8 years of experience.");
		
		Instructor instructor2 = new Instructor();
		instructor2.setfName("Engin");
		instructor2.setlName("Demiroğ");
		instructor2.setBirthDate("19.10.1985");
		instructor2.setGender("Male");
		instructor2.setId(2);
		instructor2.setEmail("engin@gmail.com");
		instructor2.setIdentityNumber("30405298");
		instructor2.setInstructorNumber("361");
		instructor2.setDetail("Expert in many fields, no need to explain, you can directly get hired.");
		
		Student student1 = new Student();
		student1.setfName("Berk");
		student1.setlName("Abay");
		student1.setBirthDate("09.04.2001");
		student1.setGender("Male");
		student1.setId(48);
		student1.setIdentityNumber("72960138");
		student1.setSchoolName("Ankara Yıldırım Beyazıt University");
		student1.setDepartment("Management Information Systems");
		student1.setEmail("abay.berk20@gmail.com");
		student1.setStudentNumber("3723");
		student1.setDetail("He knows Java. Partly it knows c # and python. He speaks english and he has no experience.");
		
		Student student2 = new Student();
		student2.setfName("Recep");
		student2.setlName("Sütoglu");
		student2.setBirthDate("23.10.2000");
		student2.setGender("Male");
		student2.setId(06);
		student2.setIdentityNumber("90713581");
		student2.setSchoolName("Ankara Yıldırım Beyazıt University");
		student1.setDepartment("Mechanical engineering");
		student1.setEmail("recep@hotmail.com");
		student1.setStudentNumber("8580");
		student1.setDetail("He is an expert in Python and drawing. Has 12 years of experience");
		
		
        User[] users = {student1, student2, instructor1, instructor2};
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addStudent(instructor2);
		instructorManager.removeStudent(instructor1);
		instructorManager.updateStudent(instructor2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.chooseInstructor(student1);
		studentManager.removeInstructor(student2);
			
	}

}
