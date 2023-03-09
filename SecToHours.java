import java.util.*;
public class SecToHours{  
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the second");
	int a = sc.nextInt();
	int hours=a/3600;
	int second=a%60;
	a=a%3600;
	int min=a/60;
	System.out.format("%d,%d,%d",hours,min,second);
}
}