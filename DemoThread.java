class Batch13 extends Thread
{
	public void run()
	{
	int a=10,b=23;
	System.out.println("Thread Batch13 :" +(a+b));
	}
}
class DemoThread{
	public static void main(String args[])
	{
	Batch13 b = new Batch13();
	b.start();
	}
}