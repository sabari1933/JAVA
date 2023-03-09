import java.util.*;
public class HashExample{  //HashSet LinkedHashSet
	public static void main (String args[]){
	HashSet<String> set= new HashSet<String>();
set.add("Ayush");
set.add("Amit");
set.add("Ayush");
set.add("Garima");

Iterator itr = set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}