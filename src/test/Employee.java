package test;

public class Employee implements Comparable<Employee>{
	private String name;
	private double age;
	private String depo;

	public Employee(String name, double age, String depo) {
		this.name = name;
		this.age = age;
		this.depo = depo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getDepo() {
		return depo;
	}

	public void setDepo(String depo) {
		this.depo = depo;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", depo=" + depo + "]";
	}

	@Override
	public int compareTo(Employee o) {
		int i = this.name.compareTo(o.getName());
		if(i != 0) {
			return i;
		}
		return Double.compare(this.age, o.getAge());
	}

}
