import java.util.*;
public class CountLetter{
	public static void main(String args []){

	Scanner sc = new Scanner(System.in);

	//String str;
	System.out.println("Enter the String: ");
	String str = sc.nextLine();

	char ch[] = str.toCharArray();
	int letters=0, spaces=0, numbers=0, others=0;
	
	for(int i=0; i<str.length(); i++)
	{
	   if(Character.isLetter(ch[i]))
	{
		letters++;
	}
	else if(Character.isSpaceChar(ch[i]))
	{
		spaces++;
	}	
	else if(Character.isDigit(ch[i]))
	{
		numbers++;
	}
	else
	{
		others++;
	}
}

System.out.println("Enter the String : " +str);
System.out.println("Enter the letter: " +letters);
System.out.println("Enter the space: " +spaces);
System.out.println("Enter the number: " +numbers);
System.out.println("Enter the others: " +others);
}
}	




