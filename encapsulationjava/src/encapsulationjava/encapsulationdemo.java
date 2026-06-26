package encapsulationjava;


class Student {
	 private String name;
	private int age ;
	
	// methods neding to accept the variables are :
	// right click after age select source and then generate getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class encapsulationdemo {
 public static void main (String []args) {
	 Student s = new Student();
			 s.setName("tanaya");
	          s.setAge(22);
	          
	          System.out.println("Name:"+ s.getName());
	          System.out.println("Age:"+ s.getAge());
 }
}
