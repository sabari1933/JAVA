class Animal{  
void eat(){
System.out.println("eating...");}  
}  
class Human{  
void toxic(){
System.out.println("Human are the toxic...");}  
} 
class Dog extends Animal,Human{  
void bark(){
System.out.println("barking...");}  
}  
class MultipleInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}} 