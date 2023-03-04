import java.util.*;
public class FiveAverage{
	public static void main(String args []){
	long a,b,c,d,e,sum,avg;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the five numbers: ");
	 a = sc.nextLong();
	 b = sc.nextLong();
	 c = sc.nextLong();
	 d = sc.nextLong();
	 e = sc.nextLong();
	sum=(a+b+c+d+e);
	avg=sum/5;
	System.out.println("Enter the avg :" + avg);
}
}