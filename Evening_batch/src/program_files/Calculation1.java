package program_files;

public class Calculation1 
{
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
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
	public int sum(int p, int q)
	{
		int r;
		r=p+q;
		System.out.println(r);
		return r;
	}
	public int sub1(int d, int e)
	{
		int f;
		f=d-e;
		System.out.println(f);
		System.out.println("taking break");
		return f;
	}
	public void div(int m, int n)
	{
		int o;
		o=m/n;
		System.out.println(o);
	}

	public static void main(String[] args) 
	{
	Calculation1 ab=new Calculation1();
	int mulresult=ab.mul(10, 2);
	int subresult=ab.sub(mulresult, 2);
	int sumresult=ab.sum(subresult, 2);
	int subresult1=ab.sub1(sumresult, 2);
	ab.div(subresult1, 2);
}

}
