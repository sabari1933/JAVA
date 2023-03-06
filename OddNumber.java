import java.util.*;
public class OddNumber{
	public static void main(String args []){
//int a=20;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers:");
	int a = sc.nextInt();

for(int i = 1; i<=a; i++)
{
if(i%2!=0)
{
System.out.println("Enter odd numbers :" +i+" ");
}

}

}
}