import java.util.*;
public class ReplaceExample1{  
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();

  
	//String s1="javatpoint is a very good website";  
String replaceString=s1.replace('t','f');//replaces all occurrences of 'a' to 'e'  
System.out.println(replaceString);  
}
}  