package week3.day1;

public class Student {
	
	public void studentInfo() {
		System.out.println(" This is my Student Info method");
	}
	
	public void studentInfo(int id) {
		System.out.println(" This is my Student Id method");
	}
	
	public void studentInfo(int id, String name) {
		System.out.println(" This is my Student Id and Name method " +id+ " , " +name+ " ");
	}
	
	public void studentInfo(String phonenumber,String Email) {
		System.out.println(" This is my Student phonenumber and Email method");
	}
	
	public static void main(String args[]) {
		
		Student ss = new Student();
		ss.studentInfo();
		ss.studentInfo(12456);
		ss.studentInfo(12964, "Raja");
		ss.studentInfo("9163860018", "rajac384@gmail.com");
	}
	
	

}
