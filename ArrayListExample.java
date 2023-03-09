 import java.util.*;
class ArrayListExample{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	


	ArrayList<Integer>list=new ArrayList<Integer>();      //<String>

	list.add(sc.nextInt());      //list.add("saba");
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
//list.add(33);
System.out.println(list);

//list.remove(1);
//list.remove(33);

Iterator itr = list.iterator();
System.out.println("enter the values are :");
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
