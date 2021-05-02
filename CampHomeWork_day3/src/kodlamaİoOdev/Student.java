package kodlama›oOdev;

public class Student extends User{
	
	private String school;
	
	public Student(int id , String firstName, String lastName,String email,String password,String courses,String school) {
		super(id,firstName,lastName,email,password);
		this.school = school;
	} 
		
	
	public Student (int id , String firstName, String lastName,String email,
					String password,String school) {
		super(id,firstName,lastName,email,password);
		
		this.school = school;
		
	}
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
}
