package Entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor {

	private String name;
	
	Set<Integer> students = new HashSet<>();
	
	public Instructor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addStudent(Integer studentID) {
		students.add(studentID);
	}
	
	public Integer studentsQuantity() {
		return students.size();
	}
	
	public String toString() {
		return this.getName() + " has " + this.studentsQuantity() + " students.";
	}
}
