package Entities;

import java.util.HashSet;
import java.util.Set;

public class Course {

	private String courseName;
	private Instructor instructor;
	
	Set<Student> students = new HashSet<>();
	
	public Course(String courseName, Instructor instructor) {
		this.courseName = courseName;
		this.instructor = instructor;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public Instructor getInstructor() {
		return this.instructor;
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public Integer studentsQuantity() {
		return students.size();
	}
	
	public Set<Integer> studentsID() {
		Set<Integer> ids = new HashSet<>();
		if (students.size() != 0) {
			for (Student student : students) {
				 ids.add(student.getID());
			}
		}
		return ids;
	}
}
