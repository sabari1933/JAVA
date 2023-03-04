import java.util.*;
public class CylinderExample{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius");
	int r = sc.nextInt();
	System.out.println("Enter height");
	int h = sc.nextInt();
	int volume=22*r*r*h/7;
System.out.println("volume is:" +volume);
}
}