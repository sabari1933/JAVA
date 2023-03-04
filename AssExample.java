import java.util.*;
public class AssExample{
	public static void main(String[] args){

Scanner mark = new Scanner(System.in);
System.out.println("Enter the mark");
int a = mark.nextInt();
if(a<=35){
System.out.println("grade c");
}else if(a>35 && a<60){
System.out.println("grade b");
}else if(a>60 && a<80){
System.out.println("grade a");
}else if(a>80 && a<100){
System.out.println("grade a+");
}else{
System.out.println("no grade");
}
}
}