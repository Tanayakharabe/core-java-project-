package package3;

import package1.A;
import package1.B;
import package2.C;
import package2.D;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 88;
		int b = 55;
		
		if(a>b)
		{
		System.out.println("A is greater");
		}
		
		A a1 = new A  ();
		a1.main(args);//(args) appears automatically when we link our object with the main method 
		B b1 = new B();
		b1.main(args);
		C c1 = new C();
		c1.main(args);
		D d1 = new D();
		d1.main(args);
		
	    
	}

}
