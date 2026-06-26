package method;

public class methoddemo {
	
	public void siri () //default method
	{
		System.out.println("hey how are you?");
	}
	//parameters with arguments method
	public void add (int a, int b){
		System.out.println(a+b);
	}
	static int square(int n) {
		return n*n;
	
		
	}
 // basic program even and odd with methods
 static void checkEvenOdd(int n) {
	 if (n%2==0) {
		 System.out.println("even");
	 }
	 else {
		 System.out.println("odd");
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method st
		methoddemo obj = new methoddemo();
		obj.siri();
		obj.add(12,15); //arguments 
		obj.checkEvenOdd(8);
		obj.square(6);
		
	}

}
