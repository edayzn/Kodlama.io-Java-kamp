package homework;

public class StudentManager extends UserManager {

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " güncellendi.");
	}
}