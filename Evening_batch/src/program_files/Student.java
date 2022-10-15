package program_files;

public class Student 
{
public Student() 
{
	this(20,30,10);
System.out.println("default constructor");	
}
public Student(int a) 
{
	this(20,30);
System.out.println("one parameterized constructor");	
}
public Student(int a, int b) 
{
	this();
System.out.println("two parameterized constructor");	
}
public Student(int a, int b, int c) 
{
	System.out.println("three parameterized constructor");	
}
public static void main(String[] args)
{
	Student ref=new Student(10);
}

}
