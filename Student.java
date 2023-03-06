class Student{
  int id;
  String name;

Student(int i,String n)
{
id=i;
name=n;
}
void display(){
System.out.println(id+""+name);
}

	public static void main(String args[]){
	Student sc = new Student(1001,"salim");

//System.out.println(obj.id);
//System.out.println(obj.name);

sc.display();

}
}

