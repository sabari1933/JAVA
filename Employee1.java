class Employee1{
int id;
String name;
Float salary;
                                          //constructor
void insert (int i,String n,float s)     // Employee (int i,String n,float s)
{                                        //{ id=i;  name=n;  salary=s;}
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

	Employee1 a = new Employee1();
	a.insert(111,"saba",500f);
	
	a.display();

}

}