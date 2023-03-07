class Animal{  
void eat(){
System.out.println("eating...");}  
}  
class Human extends Animal{  
void toxic(){
System.out.println("Human are the toxic...");}  
} 
class Dog extends Human{  
void bark(){
System.out.println("barking...");}  
}  
class MultilevelInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();
d.toxic();  
d.eat();  
}} 