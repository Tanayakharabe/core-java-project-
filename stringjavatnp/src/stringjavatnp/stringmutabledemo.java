package stringjavatnp;

public class stringmutabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Java");
		sb.append("Programming");
		sb.insert(0,"Learn");
		sb.replace(6,10,"Core");
		sb.delete(0,6);
		sb.reverse();
		
		
		System.out.println(sb);

	}

}
