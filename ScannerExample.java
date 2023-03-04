import java.util.*;
public class ScannerExample{

public static void main(String[] args){
System.out.println("Enter your name");
Scanner input = new Scanner(System.in);
String name = input.nextLine();
System.out.println(name);

System.out.println("Enter your initial ");
String initial = input.nextLine();
System.out.println(initial);

System.out.println("Enter your number ");
long number = input.nextLong();
System.out.println(initial);
}
}