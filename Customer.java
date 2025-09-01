abstract class Bankaccount{
   abstract void Deposited();
   abstract void Withdrawl();
   abstract void Savings();
   void getdetails(){
     System.out.println("Enter details of customer like name,email-id etc");
   }
}
public class Customer extends Bankaccount{
   void Deposited(){
       System.out.println("Rs.10000 Deposited in bank account");
    }
 
   void Withdrawl(){
       System.out.println("Rs.2000 withdrawled from bank account");
   }

   void Savings(){
         System.out.println("Your savings :Rs.8000 ");
   }

public static void main(String args[]){
Bankaccount b=new Customer();
b.getdetails();
b.Deposited();
b.Withdrawl();
b.Savings();
}
}






   