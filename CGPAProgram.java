import java.util.*;
public class CGPAProgram{     
public static void main (String args[]){
     
    double English, Hindi, Maths, Science, SocialStudy, CGPA, CGPAper ; 

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values");
	long a = sc.nextLong();
	long b = sc.nextLong();
	long c = sc.nextLong();
	long d = sc.nextLong();
	long e = sc.nextLong();

CGPA = (a+b+c+d+e)/5;
CGPAper = (9.5*(CGPA));
System.out.println("CGPA percentage is :" +CGPAper);


 
   /* English = 9.1;  
    Hindi = 8.5;  
    Maths = 9.5;  
    Science =9.6;  
    SocialStudy = 8.6;  
    CGPA = (9.1+8.5+9.5+9.6+8.6)/(5.0);  
    CGPAper = (float)(9.5 * (CGPA));  
    System.out.println(" CGPA Percentage is:  "+CGPAper);  
    */

} 
 
}  