package method;

public class squarecalculator {
	static int square (int n) {
		return n*n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squarecalculator obj1 = new squarecalculator();
		
		int num = 5;
		
		int result = obj1.square(num);
	
		System.out.println("square of"+"  " + num+ " " + "is" + " " + result);
		

	}

}
