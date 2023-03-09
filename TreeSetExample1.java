import java.util.*;
public class TreeSetExample1{  //HashSet LinkedHashSet
	public static void main (String args[]){
	TreeSet<String> set= new TreeSet<String>();
set.add("Ayush");
set.add("salim");
set.add("Ayush");
set.add("Garima");
set.add(" ");




Iterator itr = set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}