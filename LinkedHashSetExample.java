import java.util.*;
public class LinkedHashSetExample{  //HashSet LinkedHashSet
	public static void main (String args[]){
	LinkedHashSet<String> set= new LinkedHashSet<String>();
set.add("Ayush");
set.add("Amit");
set.add("Ayush");
set.add("Garima");
set.add(" ");

Iterator itr = set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}