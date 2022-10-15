package program_files;

public class Student1 
{
public void method() 
{
	this.method3();
	System.out.println("Default method");
	this.method1();
	this.method2();
	this.method4();
	
}
public void method1() 
{
	System.out.println("one parameterized method");
}
public void method2()
{
	System.out.println("two parameterized method");
}
public void method3() 
{
	System.out.println("three parameterized method");
}
public void method4() 
{
	System.out.println("four parameterized method");
}
public static void main(String[] args) 
{
	Student1 ab=new Student1();
	ab.method();
	
}
}
