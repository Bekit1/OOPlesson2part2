package task1;

public class Human {
	private String name;
	private String surname;
	private int age;
	private boolean sex;

	public Human(String name, String surname, int age, boolean sex) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ", age=" + age + ", sex=" + sex;
	}

}
