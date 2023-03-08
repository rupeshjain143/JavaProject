
public class Student {
	
	String name(String name) {
		
		return name;
		
	}
  
	public static void main(String[] args) {
		
		Student student = new Student();

		String r = student.name("Rupesh");
		
		System.out.println("Student Name is ==" + r);
		
	} 
}
