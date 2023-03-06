import java.util.*;
public class PowerNum  
{  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
 	

        System.out.println("Enter the value x");
	int x = sc.nextInt();
	System.out.println("Enter the value y");
	int y = sc.nextInt();

       System.out.println("Enter the power values :" +Math.pow(x, y));

    // System.out.println("exp of a is: " +Math.exp(x));      
    }  
}  