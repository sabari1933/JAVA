interface printable{
void print();
}
class InterfaceExample implements printable{
	public void print(){
System.out.println("user interface program is achieve");
}
public static void main(String args[]){
InterfaceExample obj = new InterfaceExample();
obj.print();
}
}