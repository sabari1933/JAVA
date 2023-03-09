import java.util.*;
public class TreeMapExample{  //HashSet LinkedHashSet
	public static void main (String args[]){
	TreeMap<Integer,String> lm= new TreeMap<Integer,String>();

lm.put(101,"Ayush");
lm.put(102,"salim");
lm.put(103,"Ayush");
lm.put(104,"Garima");
lm.put(105," ");
lm.put(null  ,"Kumaru");   //<String> Null values allowed but empty space not allowed

for(Map.Entry m:lm.entrySet())
{
System.out.println(m.getKey()+""+m.getValue());

}
}
}