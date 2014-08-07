public class Employee {
	public Employee(String firstName, String lastName, int id,
			String designation, float salary, String department

	) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
		this.department = department;
	}

	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	private String lastName;
	private int id;
	private String designation;
	private float salary;
	private String department;

}
