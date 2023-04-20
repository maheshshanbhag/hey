class cal
{
	public static int add(int x, int y)
	{
		return x+y;
	}
	public static int sub(int x, int y)
	{
		return x-y;
	}
	public static int multi(int x, int y)
	{
		return x*y;
	}
	public static int div(int x, int y)
	{
		return x/y;
	
	}
}

class result
{
	public static void display(int value)
	{
		System.out.println("the value :"+value);
	}
}

class labprogram_62
{
	public static void main(String args[])
	{
		int a=cal.add(20,30);
		result.display(a);
		
		int b=cal.sub(30,20);
		result.display(b);
		
		int c=cal.multi(5,10);
		result.display(c);
		
		int d=cal.div(25,5);
		result.display(d);
	}
}
