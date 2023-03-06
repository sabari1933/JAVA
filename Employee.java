import java.util.*;
class Employee{
int id;
String name;
Float salary;
                                          //constructor
Employee(int i,String n,float s)     
{                                       
id=i;
name=n;
salary=s;
}

void display()
{
System.out.println(id+""+name+""+salary);
}
                                          //public class TestEmployee
public static void main(String args[]){

	Employee a = new Employee(111,"sam",500f);

/*Scanner sc = new Scanner(System.in);
System.out.println("Enter the id :");
 Employee.b = sc.nextInt();
System.out.println("Enter the String :");
 Employee.sam = sc.nextLine();
System.out.println("Enter the float :");
 Employee.d = sc.nextInt();*/

	
	a.display();

}

}