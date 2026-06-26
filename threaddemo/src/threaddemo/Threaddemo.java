package threaddemo;



class BoilWater extends Thread{
	public void run () {
		System.out.println("Boiling Water..");
	}
	
	}
class HeatMilk extends Thread{
	public void run() {
		System.out.println("Heating Milk..");
	}
}
 
class GrindCoffee extends Thread {
		public void run() {
			System.out.println("Grinding Coffee Beans");
		}
	}

public class Threaddemo{
	
	public static void main(String[] args) throws InterruptedException {
	
    BoilWater t1=new BoilWater();
    HeatMilk t2 = new HeatMilk ();
	GrindCoffee t3= new GrindCoffee();
    
	t1.start();
	Thread.sleep(5000);
	t2.start();
	Thread.sleep(5000);
	t3.start();
	Thread.sleep(5000);
	

	}

}

