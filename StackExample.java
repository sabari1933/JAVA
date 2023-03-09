import java.util.*;
public class StackExample{
	public static void main (String args[]){
	Stack<String> stack = new Stack<String>();


stack.push("Ayush");
stack.push("Garvit");
stack.push("Amit");       //stack.pop();
stack.push("Ashish");
stack.push("Garima");
stack.pop();

System.out.println(stack);
Collections.sort(stack);
System.out.println(stack);
Collections.sort(stack,Collections.reverseOrder());
System.out.println(stack);

Iterator<String>itr = stack.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}