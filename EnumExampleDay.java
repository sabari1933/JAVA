class EnumExampleDay{  
enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}  
public static void main(String args[]){  
Day day=Day.SATURDAY;  
//Day day=Day.WEDNESDAY; 
//Day day=Day.FRIDAY; 
  
switch(day){  
case SUNDAY:   
 System.out.println("sunday");  
 break;  
case MONDAY:   
 System.out.println("monday");  
 break;  
case TUESDAY:   
 System.out.println("sunday");  
 break;  
case WEDNESDAY:   
 System.out.println("monday");  
 break; 
case THURSDAY:   
 System.out.println("sunday");  
 break;  
case FRIDAY:   
 System.out.println("monday");  
 break; 


default:  
System.out.println("other day");  
}  
}} 