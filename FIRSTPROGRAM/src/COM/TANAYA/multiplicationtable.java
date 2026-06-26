package COM.TANAYA;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int i = 1;
		
		while (i<=10)
		{
			System.out.println(n + "x" + i + "=" + (n +i));
			i++;
		}

	}

}
