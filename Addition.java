import java.util.*;
class Addition{

int a,b;   //static

public void basicAdd(int a,int b){
System.out.println("Addition :" +(a+b));
System.out.println("Multiplication :" +(a*b));
}



public static void main(String args[]){
	Addition c = new Addition();

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the a values");
	c.a = sc.nextInt();       //a

	System.out.println("Enter the b values");
	c.b = sc.nextInt();      //b


	c.basicAdd(c.a,c.b);     //(a,b)

}
}
