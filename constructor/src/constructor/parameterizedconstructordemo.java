package constructor;

public class parameterizedconstructordemo {
	String name;
	int age;
	
	//parameterized constructor
	parameterizedconstructordemo(String n , int a) {
	 name = n ;
	 age = a ;
	 
	}
 
	//method to display data
	void display () {
		System.out.println("NAME:" + name);
		System.out.println("AGE:" + age);
	}
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 parameterizedconstructordemo obj1 = new parameterizedconstructordemo("sohail",25);
				 parameterizedconstructordemo obj2 = new parameterizedconstructordemo("ali",20);
				 
				 obj1.display();
				 System.out.println();
				 obj2.display();
	}
 
}
