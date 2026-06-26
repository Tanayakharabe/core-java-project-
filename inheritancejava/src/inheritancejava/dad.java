package inheritancejava;


//single inheritance
class child {
	public void house () {
		System.out.println("1cr");
	}
public void car () {
	System.out.println("swift dezire");
}
}

public class dad extends child {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 dad akshay = new dad ();
 akshay.house();
 akshay.car();
	}
  
}
