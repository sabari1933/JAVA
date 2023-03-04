import java.util.*;
public class SwapWithThird{
	public static void main(String[] args){
       int temp;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the a value");
	 int a = input.nextInt();
	System.out.println("Enter the b value");
	 int b = input.nextInt();
  temp=a;
  a=b;
  b=temp;
System.out.println("enter the value a:" +a);
System.out.println("enter the value b:" +b);
}
}