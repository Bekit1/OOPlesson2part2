package task1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Group g1 = new Group();
		try {
			g1.addStudent();
		} catch (GroupIsAlreadyFullException e) {
			System.out.println(e.getMessage());
		}
		try {
			g1.addStudent();
		} catch (GroupIsAlreadyFullException e) {
			System.out.println(e.getMessage());
		}
		try {
			g1.addStudent();
		} catch (GroupIsAlreadyFullException e) {
			System.out.println(e.getMessage());
		}
		g1.deleteStudent();

		try {
			g1.showInformation();
		} catch (NullPointerException e) {
			System.out.println("There are no more students");
		}

		g1.setType();
		g1.sortByType();

		g1.showInformation();

		Army m = new Army("Vlad");
		m.show(g1);
		g1.findStudentBySurname();
		g1.showInformation();
	}

}
