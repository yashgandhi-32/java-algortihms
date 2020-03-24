package l10;

public class Student {
	// data members are initialized to 0 or NULL
	// default public private protected
	final String name;// = "abc";
	private int age;
	private String college;
	private static int numStudents;
	
	public int hashCode() {
		return age;
	}
	
	public static int getNumStudents() {
		return numStudents;
	}
	
	public Student(String n, int a) {
		name = n;
		age = a;
		numStudents++;
	}
	
	public Student(String n, int a, String c) {
		name = n;
		setAge(a);
		college = c;
		numStudents++;
	}
	
	public void setName(String n) {
		//name = n;
	}
	
	public void setAge(int a) {
		int temp = getAge();
		if (a < 10) {
			return;
		}
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	
	void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(college);
	}
}
