class Addition{
	public void display(int a, int b){
	a=5;
	b=10;
	System.out.println("Enter the Addition :" +(a+b));
	}
class AdditionSub extends Addition {
	public void display(int a, int b,int c){
	a=5;
	b=10;
	c=a+b;
	System.out.println("Enter the Addition :" +c);
	}
class Addition1 extends AdditionSub {
	public static void main(String args[]){
	Addition1 obj = new Addition1();
	obj.display();
	super.display();
}
}