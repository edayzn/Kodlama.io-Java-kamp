package homework;

public class InstructorManager extends UserManager {

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " silindi.");
	}
}
