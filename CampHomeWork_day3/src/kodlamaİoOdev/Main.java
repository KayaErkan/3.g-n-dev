package kodlama�oOdev;

public class Main {

	public static void main(String[] args) {
		
		
		
		Student student = new Student(14565, "R�fk�", "Karabatak", "BayKarabatak@gmail.com", "Asdfg123456", "KAT�");
	
		student.setId(14565);
		student.setFirstName("R�fk�");
		student.setLastName("Karabatak");
		student.setEmail("BayKarabatak@gmail.com");
		student.setPassword("Asdfg123456.");
		student.setSchool("KAT�");


		Instructor instructor = new Instructor(123, "Engin", "Demirog", "engin@hotmail.com", "56565","java");

		instructor.setId(123);
		instructor.setFirstName("Engin");
		instructor.setLastName("DemiroG");
		instructor.setEmail("engin@hotmail.com");
		instructor.setPassword("56565");
		instructor.setCourses("Java");


		System.out.println(student.getFirstName());

		StudentManager studentManager = new StudentManager();

		studentManager.courseOperation();

		InstructorManager instructorManager = new InstructorManager();
        instructorManager.edit();
	}

}
