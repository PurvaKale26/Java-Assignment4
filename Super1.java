import java.util.*;
class Employee{
int salary=50000;
}
public class Super1 extends Employee {
int salary=90000;
public void result(){
int total=salary+super.salary;
System.out.println("Total salary:"+total);
}

public static void main(String args[]){
Super1 s=new Super1();
s.result();
}
}

