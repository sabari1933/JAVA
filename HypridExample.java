class Human{
	public void showHuman(){
	System.out.println("Human");
	}
}
interface Father{
	public void show();
}
interface Mother{
	public void show();
}
class Child extends Human implements Father,Mother{
	public void show(){
	System.out.println("invoking show method");
}
	public void showChild(){
	System.out.println("show child method");
	
}
}
class HypridExample{
public static void main(String args[]){

Child c = new Child();
//HypridExample c = new HypridExample ();
c.showHuman();
c.show();
c.showChild();
}
}
