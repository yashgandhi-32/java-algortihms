package l10;

public class StudentUse {

	public static void main(String[] args) {
		// this is a local variable, will not be initialized for you
//		String abc;
//		System.out.println(abc);
		Student s1 = new Student("Abc", -10, "college1");
		Student s2 = new Student("DEF", 16, "college2");
		
		Student s3 = new Student("ghi", 20);
		
		s1.print();
		
		s2.print();
		
		//Student.getAge();
		
		System.out.println(s1.getNumStudents());
//		System.out.println(Student.numStudents);
//		System.out.println(s1.numStudents);
//		System.out.println(s2.numStudents);
//		// static data members are shared by everyone
//		s1.numStudents = 100;
//		System.out.println(s1.numStudents);
//		System.out.println(s2.numStudents);
	}

}
