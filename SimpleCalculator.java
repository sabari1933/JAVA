import java.util.*;
public class SimpleCalculator{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the fist number: ");
	int a = sc.nextInt();
	System.out.println("Enter the second number: ");
	int b = sc.nextInt();

	int c = a+b;
	System.out.println("Enter the Add numbers:" +c);
	
	int d = a-b;
	System.out.println("Enter the sub  numbers:" +d);
	
	int e = a*b;
	System.out.println("Enter the mul  numbers:" +e);
	
	int f = a/b;
	System.out.println("Enter the div numbers:" +f);
	
	int g = a%b;
	System.out.println("Enter the modu numbers:" +g);

}
}