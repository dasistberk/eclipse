package javaCampDay3;

public class UserManager {
	public void add(User user) {
		System.out.println("Students with ID number " + user.getId() + " added to kodlama.io.");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);		
		}
	}
}
