import java.util.*;
public class TreeSetExample1{  //HashSet LinkedHashSet
	public static void main (String args[]){
	TreeSet<String> set= new TreeSet<String>();
set.add("Ayush");
set.add("Amit");
set.add("Ayush");
set.add("Garima");
set.add(" ");


System.out.println(set);
Collections.sort(set);
System.out.println(set);
Collections.sort(set,Collections.reverseOrder());
System.out.println(set);




Iterator itr = set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}