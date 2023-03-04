import java.util.*;
public class ArithmeticOperators{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("enter a");
int a = input.nextInt();

System.out.println("enter b");
int b = input.nextInt();



System.out.println("Addition :" + (a+b));
System.out.println("Subtraction :" + (a-b));
System.out.println("Multiple :" + (a*b));
System.out.println("Divisio :" + (a/b));
System.out.println("Modules :" + (a%b));
System.out.println("Shift left :" + (a<<b));
System.out.println("Shift right :" + (a>>b));
System.out.println("Shift right :" + (a>>>b));

/*System.out.println(-30>>2);
System.out.println(-20>>>3);*/

}
}