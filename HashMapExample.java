import java.util.*;
public class HashMapExample{  //HashSet LinkedHashSet
	public static void main (String args[]){
	HashMap<Integer,String> map= new HashMap<Integer,String>();

map.put(101,"Ayush");
map.put(102,"salim");
map.put(103,"Ayush");
map.put(104,"Garima");
//map.put("105"," ");
//map.put(" ","Kumaru");   //<String>

//for(Map.Entry m:map.entrySet())
//{
//System.out.println(m.getKey()+""+m.getValue());

//}

map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);



}
}