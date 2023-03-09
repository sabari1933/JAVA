 import java.util.*;
class LinkedListExample{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
System.out.println("Enter the values");

	LinkedList<Integer>list=new LinkedList<Integer>();

	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	

Iterator itr = list.iterator();

System.out.println("Enter the values :" +itr); 

while(itr.hasNext()){
System.out.println(itr.next());
}
}
}