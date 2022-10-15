package program_files;

public class Calculation 
{
	public int sum(int a, int b) 
	{
	int c;
	c=a+b;
	System.out.println(c);
	return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println(z);		
		return z;
		}
	public int mul(int p, int q)
	{
		int r;
		r=p*q;
		System.out.println(r);
		return r;
		}

	public static void main(String[] args) 
	{
	Calculation a=new Calculation();
	int s=a.sum(10,2);
	int v=a.sub(s,2);
	a.mul(s,v);
	}
}
