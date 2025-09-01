class Employee{
int salary;
Employee(int salary){
this.salary=salary;
System.out.println("Employee constructor called");
}
}
public class Super3 extends Employee{
int bonus;

Super3(int salary,int bonus){
super(salary);
this.bonus=bonus;
System.out.println("Super3 constructor called");
}

void display(){
System.out.println("salary:"+salary);
System.out.println("bonus:"+bonus);
int total=salary+bonus;
System.out.println("total:"+total);
}
public static void main(String args[]){

Super3 s=new Super3(100000,25000);
s.display();
}
}






