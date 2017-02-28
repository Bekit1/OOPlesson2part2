package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voenkom {
	private Student[] group = new Student[10];

	public Group(Student[] group) {
		super();
		this.group = group;
	}

	public Group() {
		super();
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	}

	public void addStudent() throws GroupIsAlreadyFullException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write name of new student:");
		String name = sc.nextLine();
		System.out.println("Write surnamename of new student:");
		String surname = sc.nextLine();
		System.out.println("Write age of new student:");
		int age = sc.nextInt();
		Scanner st = new Scanner(System.in);
		System.out.println("Write true if new student is male of false if it is female:");
		String gender = st.nextLine();
		boolean sex = true;
		if (gender == "true") {
			sex = true;
		}
		if (gender == "false") {
			sex = false;
		}
		System.out.println("Write course of new student:");
		int couse = st.nextInt();
		System.out.println("Write group of new student:");
		int group1 = st.nextInt();
		Scanner sp = new Scanner(System.in);
		System.out.println("Write speciality of new student:");
		String speciality = sp.nextLine();
		Student student = new Student(name, surname, age, sex, couse, group1, speciality, "nothing");
		for (int i = 0;; i++) {
			if (i >= group.length)
				throw new GroupIsAlreadyFullException();
			if (group[i] == student) {
				System.out.println("This student already in the group");
				break;
			}
			if (group[i] == null) {
				group[i] = student;
				break;
			}
		}
	}

	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write name of student which you wanna delete:");
		String name = sc.nextLine();
		System.out.println("Write surname of this student:");
		String surname = sc.nextLine();
		for (int i = 0; i < group.length; i++) {
			if (group[i].getName().equalsIgnoreCase(name) && group[i].getSurname().equalsIgnoreCase(surname)) {
				group[i] = null;
				break;
			}
		}
	}

	public void findStudentBySurname() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write surname of student which you wanna find:");
		String surname = sc.nextLine();
		int exist = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getSurname().equalsIgnoreCase(surname)) {
				System.out.println("This student is: " + group[i].toString());
				exist++;
				break;
			}
		}
		if (exist == 0) {
			System.out.println("There is no such student");
		}
	}

	public void showInformation() {
		System.out.println("Group contains such students:");
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				System.out.println(group[i].toString());
			}
		}

	}

	public void sortByType() {
		int range = 0;
		for (int i = 0; i < this.group.length - 1; i++) {
			for (int j = i; j < this.group.length - 1; j++) {
				if (this.group[i] == null && this.group[j] != null) {
					this.group[i] = this.group[j];
					this.group[j] = null;

				}
				if (this.group[i] != null) {
					range = i;
				}
			}
		}

		Arrays.sort(this.group, 0, range + 1);

	}

	public void setType() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input type for sorting:");
		String type = sc.nextLine();
		for (int i = 0; i < this.group.length; i++) {
			if (this.group[i] != null) {
				this.group[i].setType(type);
			}
		}
	}

	@Override
	public String toString() {

		return Arrays.toString(group);

	}

	@Override
	public void showMale() {
		// TODO Auto-generated method stub
		Student[] compare = new Student[10];
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getAge() >= 18 && group[i].isSex() == true) {
				compare[i] = group[i];
			}
		}

		for (int i = 0; i < compare.length; i++) {
			for (int j = i; j < compare.length; j++) {
				if (compare[i] == null && compare[j] != null) {
					compare[i] = compare[j];
					compare[j] = null;

				}
			}
		}

		System.out.println("Group contains such students older 18:");
		for (int i = 0; i < compare.length; i++) {
			if (compare[i] != null) {
				System.out.println(compare[i].toString());
			}
		}
	}
}
