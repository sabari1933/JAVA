class A extends Thread
{
	public void run()
	{
	int a=10,b=23;
	System.out.println("Thread Addition :" +(a+b));
	}
}
class B extends Thread
{
	public void run()
	{
	int a=10,b=23;
	System.out.println("Thread Subtraction :" +(a-b));
	}
}
class C extends Thread
{
	public void run()
	{
	int a=10,b=23;
	System.out.println("Thread Multiplication :" +(a*b));
	}
}
class D extends Thread
{
	public void run()
	{
	int a=10,b=23;
	System.out.println("Thread Division :" +(a/b));
	}
}
class Multithreading{
	public static void main(String args[]){
	A a1 = new A();
B b1 = new B();
C c1 = new C();
D d1 = new D();

a1.start();
b1.start();
c1.start();
d1.start();
}
}