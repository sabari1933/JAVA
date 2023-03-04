import java.util.*;
public class VowelConstant{
	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the char");
char ch = sc.nextLine().charAt(0);
switch(ch){
case 'a':System.out.println("vowel");
	break;
case 'e':System.out.println("vowel");
	break;
case 'i':System.out.println("vowel");
	break;
case 'o':System.out.println("vowel");
	break;
case 'u':System.out.println("vowel");
	break;
default:System.out.println("constant");
}
}
}