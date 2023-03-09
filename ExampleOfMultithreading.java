class Multiplication extends Thread
{
	public void run()
	{
	int n=5;
//int a,b,c;
for(int i=1;i<=5;i++)
{
//c=a*b;

	System.out.println(n+"*"+i+" = " +n*i);
}
	}

}

class Fibonacci extends Thread
{
	public void run()
	{    
 int a=0,b=1,c,i,count=10;    
 System.out.println(a); 
    System.out.println(b); 
 for(i=2;i<count;i++)    
 {    
  c=a+b;    
  
  a=b;    
 b=c; 
System.out.println(c);       
 }    
  
}  
}
class Factorial extends Thread
{
	public void run()
	{
	int i,fact=1;
	int n=5;
		for(i=1;i<=n;i++)
		{

		fact= fact*i;
		}
System.out.println("Factorial of" +n+"is:" +fact);
	}
}
class SumOFArray extends Thread
{    
	public void run()
	{
	  int arr[] ={1, 2, 3, 4, 5};  
        int sum = 0;  
          
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of array elements: " + sum);  
	}
}
class ExampleOfMultithreading{
	public static void main(String args[]){
	Multiplication a1 = new Multiplication ();
	Fibonacci b1 = new Fibonacci ();
	Factorial c1 = new Factorial();
	SumOFArray d1 = new SumOFArray();

a1.start();
b1.start();
c1.start();
d1.start();
}
}