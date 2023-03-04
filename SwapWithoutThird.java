import java.util.*;
public class SwapWithoutThird{
	public static void main(String[] args){
      // int a,b;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the before swap");
	 int a = input.nextInt();
	System.out.println("Enter the before swap ");
	 int b = input.nextInt();
 	
	a=a+b;
	b=a-b;
	a=a-b;
	
System.out.println("enter the after swap a:" +a);
System.out.println("enter the after swap  b:" +b);
}
}