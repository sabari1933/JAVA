import java.util.*;
public class LinkedHashMapExample{  //HashSet LinkedHashSet
	public static void main (String args[]){
	LinkedHashMap<String,String> lm= new LinkedHashMap<String,String>();

lm.put("101","Ayush");
lm.put("102","salim");
lm.put("103","Ayush");
lm.put("104","Garima");
lm.put("105"," ");
lm.put(" ","Kumaru");   //<String>

for(Map.Entry m:lm.entrySet())
{
System.out.println(m.getKey()+""+m.getValue());

}
}
}