import java.util.*;
class MethodOverloading{
	public void m1(int a,int b){
	System .out.println(a+b);
	}
	public void m1(int c,String d){
	System .out.println(c+"  "+d);
	}
	public void m1(int c,int a,int b){
	System .out.println(c+a+b);
	}

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System .out.println("Enter the  String value");
	String d = sc.nextLine();
	System .out.println("Enter the value");
	int a = sc.nextInt();
	System .out.println("Enter the value");
	int b = sc.nextInt();
	System .out.println("Enter the value");
	int c = sc.nextInt();
	System .out.println("Enter the value");
	int e = sc.nextInt();
	System .out.println("Enter the value");
	int f = sc.nextInt();
	System .out.println("Enter the value");
	int g = sc.nextInt();

	MethodOverloading obj = new MethodOverloading();
	obj.m1(a,b);
	obj.m1(c,d);
	obj.m1(e,f,g);
}
}