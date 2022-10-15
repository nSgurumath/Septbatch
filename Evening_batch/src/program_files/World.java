package program_files;

public class World 
{
int x;
int y;

public void result()
{
	System.out.println("result is pass");
}
public void result1()
{
	System.out.println("result is first class");
}
public static void main(String[] args) 
{
	World ref=new World();
	ref.x=20;
	System.out.println(ref.x);
	ref.y=230;
	System.out.println(ref.y);
	ref.result();
	ref.result1();
			
}
}
