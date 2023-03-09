import java.util.*;
class Batch extends Thread
{
public void run()
{
//int a=2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers");
int a = sc.nextInt();

if(a%2==0)
{
System.out.println("Not prime numbers");
} else {
System.out.println("prime numbers");
}

}
}
class PrimeNumber{
	public static void main(String args[]){

	Batch obj = new Batch();
	obj.start();
}
}