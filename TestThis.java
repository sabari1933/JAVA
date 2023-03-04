class Student{
	int rollno;
	String name;
	float fee;
                       
	Student(int rollno,String name,float fee){     //int 1,String "next",float f;
	rollno=rollno;          //this.rollno=rollno
	name=name;             //rollno=r;
	fee=fee;
	}
	 void display(){    
	System.out.println(rollno+""+name+""+fee);
	} 
}
	class TestThis{
	public static void main(String args[]){

	Student s1 = new Student(111,"Karan",500f);
	Student s2 = new Student(222,"Aryan",600f);
	Student s3 = new Student(333,"Sonoo",700f);

	s1.display();
	s2.display();
	s3.display();
                              
	}
}