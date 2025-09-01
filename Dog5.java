abstract class Animal{
  abstract void makeSound();

void sleep(){
System.out.println("sleep..");
}
}
 class Dog5 extends Animal{
   void makeSound(){
     System.out.println("Bark!..");
    }
public static void main(String args[]){
Animal d=new Dog5();
d.sleep();
d.makeSound();
}
}
