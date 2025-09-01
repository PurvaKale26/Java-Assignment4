import java.util.*;
class Employee{
int salary=50000;
void display(){
System.out.println("Employee salary is:"+salary);
}
}
public class Super2 extends Employee{
int bonus=10000;
void display(){
super.display();
System.out.println("Employee bonus is:"+bonus);
int total=bonus+super.salary;
System.out.println("Total salary:"+total);
}
public static void main(String args[]){
Super2 s1=new Super2();

s1.display();
}
}

