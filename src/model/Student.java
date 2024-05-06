package model;

public class Student {

	private int roll;
	private String name;
	private Address add;
	

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
	}
	

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public Student(Address add) {
		super();
		this.add = add;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + add + "]";
	}
	
	
	
	
}
