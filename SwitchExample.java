import java.util.*;
public class SwitchExample{
	public static void main(String[] args){
	
Scanner input =new Scanner(System.in);
System.out.println("Enter the numbers");
int day = input.nextInt();
switch(day){
case 1:System.out.println("sunday");
break;
case 2:System.out.println("Monday");
break;
case 3:System.out.println("Tuesday");
break;
case 4:System.out.println("Wednesday");
break;
case 5:System.out.println("thursday");
break;
case 6:System.out.println("friday");
break;
case 7:System.out.println("saturday");
break;
default :System.out.println("invalite");
}
}
}