package Application;

import Entities.Course;
import Entities.Instructor;
import Entities.Student;

public class Application {

	public static void main(String[] args) {
		
		Instructor instructorAlex = new Instructor("Alex");
		
		Course A = new Course("A", instructorAlex);
		Course B = new Course("B", instructorAlex);
		Course C = new Course("C", instructorAlex);
		
		Student one = new Student(21);
		Student two = new Student(35);
		Student three = new Student(22);
		Student four = new Student(50);
		Student five = new Student(42);
		Student six = new Student(13);
		
		A.addStudent(one);A.addStudent(two);A.addStudent(three);
		B.addStudent(one);B.addStudent(four);
		C.addStudent(five);C.addStudent(two);C.addStudent(six);
		
		for (Integer id : A.studentsID()) {
			instructorAlex.addStudent(id);
		}
		
		for (Integer id : B.studentsID()) {
			instructorAlex.addStudent(id);
		}
		
		for (Integer id : C.studentsID()) {
			instructorAlex.addStudent(id);
		}
		
		System.out.print(instructorAlex);
	}
}
