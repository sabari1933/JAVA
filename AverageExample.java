import java.util.*;
public class AverageExample{
	public static void main(String[] args){

	Long a,b,c,d,e,sum,avg;

Scanner input = new Scanner(System.in);
System.out.println("Enter the five numbers");

a = input.nextLong();
b = input.nextLong();
c = input.nextLong();
d = input.nextLong();
e = input.nextLong();
sum=(a+b+c+d+e);
avg=sum/5;
System.out.println(sum);
System.out.println(avg);

  
/*int a=4,b=3,c=5,d=6,e=7,sum,avg;
System.out.println("Enter the five numbers");
sum=(4+3+5+6+7);
avg=sum/5;
System.out.println(sum);
System.out.println(avg);*/
}
}