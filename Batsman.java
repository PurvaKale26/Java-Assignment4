abstract class Player{
   abstract void Fitness();

}
public class Batsman extends Player{
  void Fitness(){
  System.out.println("In fitness Method");
   }
public static void main(String args[]){
   Player P=new Batsman();
   P.Fitness();
}
}
