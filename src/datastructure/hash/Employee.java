package datastructure.hash;

public class Employee {
	private String name;
	private double salary;
	private int seniority;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	@Override
	public boolean equals(Object rhs) {
		return rhs instanceof Employee && this.name.equals(((Employee) rhs).name);
	}
}
