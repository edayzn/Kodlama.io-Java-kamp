package homework;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.seteMail("xxx@xxx.xxx");
		instructor.setPassword("xxx");
		instructor.setBranch("Yazýlým Geliþtirici");
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Eda");
		student.setLastName("Yazan Ayan");
		student.seteMail("xx@xx.xxx");
		student.setPassword("x");
		student.setEducationLevel("Lisans");
		
		UserManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		
	
		UserManager userManager= new StudentManager();
		userManager.add(student);
		userManager.delete(student);
	}

}
