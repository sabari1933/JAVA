import java.io.*;
public class MathExample{
	public static void main(String[] args){

	int sc[] = {1,3,6,9,5,7,8};
System.out.println("before change :"+sc[2]);
sc[2] = 33;
System.out.println("after change :"+sc[2]);

System.out.println("before change :"+sc[3]);
sc[3] = sc[3]+7;
System.out.println("after change :"+sc[3]);

System.out.println("before change :"+sc[4]);
sc[4] = sc[4]-2;
System.out.println("after change :"+sc[4]);

int add = (sc[3]+sc[4]);
System.out.println("math function :"+add);

int sub = (sc[3]-sc[4]);
System.out.println("math function :"+sub);

int divi = (sc[3]/sc[4]);
System.out.println("math function :"+divi);

float mean = sc[3]/sc[4];
System.out.println("math function :"+mean);


System.out.println("value of 5th :"+sc[5]);
}
}