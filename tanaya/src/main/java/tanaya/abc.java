package tanaya;

public class abc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum = 0; // sum is us to assign value i.e 0 and also to store result
		
		for(int i=0;i<=20;i++)
		{
			if(i % 2 == 0)//if-else only can be used if 
				          //-we want toprint the statement if the no. is odd or even
			{
				System.out.println("even no:" +i);//save value of i i.e
				//-diivisible by 7 in sum
			}
			else if (i % 2 !=0) //else if used as we want to display the no.
				                // could have used sum+=i etc. but 
                                 //-we just want to displAY THE NO. AND NOT ADDITION  
				//-(THATS WHY USED i, TOOK OUT THE O/P IN i)
			{
				System.out.println("odd no:" +i);
			}
		}
	}

}
