package program_files;

public class Arithmatic 
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
public int sum1(int p, int q)
{
	int r;
	r=p+q;
	System.out.println(r);
	return r;
}
public int mul(int m, int n)
{
	int o;
	o=m*n;
	System.out.println(o);
	return o;
}
public void div(int d, int e)
{
	int f;
	f=d/e;
	System.out.println(f);
	}
public static void main(String[] args) 
{
	Arithmatic obj=new Arithmatic();
	int sumresult=obj.sum(10, 2);
	int subresult=obj.sub(sumresult, 2);
	int sumresult1=obj.sum1(subresult, 2);
	int mulresult=obj.mul(sumresult1, 2);
	obj.div(mulresult,2);
}


}
