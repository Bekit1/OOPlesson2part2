package task1;

import java.util.Scanner;

public class Student extends Human implements Comparable {
	private int course;
	private int group;
	private String specialty;
	private String type;

	public Student(String name, String surname, int age, boolean sex, int course, int group, String specialty,
			String type) {
		super(name, surname, age, sex);
		this.course = course;
		this.group = group;
		this.specialty = specialty;
		this.type = type;
	}

	public Student(String name, String surname, int age, boolean sex) {
		super(name, surname, age, sex);
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Student " + super.toString() + ", course=" + course + ", group=" + group + ", specialty=" + specialty
				+ "]";

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student anotherStudent = (Student) o;
		if (anotherStudent == null) {
			return -1;

		}

		if (this.getType().equalsIgnoreCase("name")) {
			return this.getName().compareToIgnoreCase(anotherStudent.getName());
		}

		if (this.getType().equalsIgnoreCase("surname")) {
			return this.getSurname().compareToIgnoreCase(anotherStudent.getSurname());
		} 
		if (this.getType().equalsIgnoreCase("age")) {
			return this.getAge()-anotherStudent.getAge();
		}
		if (this.getType().equalsIgnoreCase("course")) {
			return this.getCourse()-anotherStudent.getCourse();
		}
		if (this.getType().equalsIgnoreCase("group")) {
			return this.getGroup()-anotherStudent.getGroup();
		}
		if (this.getType().equalsIgnoreCase("speciality")) {
			return this.getSpecialty().compareToIgnoreCase(anotherStudent.getSpecialty());
		}
		else {
			return 0;
		}
	}
}