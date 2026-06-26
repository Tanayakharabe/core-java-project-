package tanaya1;

public class tnya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // sum is us to assign value i.e 0 and also to store result
		
		for(int i=0;i<=200;i++)
		{
			if(i % 7 == 0)
			{
				sum += i; // save value of i i.e diivisible by 7 in sum
			}
		}
		
				
		System.out.println("addition of no. from 0 to 200 which is divisible by 7 :" +sum);
	}

}
