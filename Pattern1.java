class Pattern1
{
	public void printPat()
	{
		int a,b;
		a=1;
		b=10;
		for(int i = 0; i<5; i++)
		{
			int temp;
			temp=a*a;
			System.out.println(temp);
			a=a+b;
			//System.out.println(a);
			b=b*10;
		}
	}
	public static void main(String args[])
	{
		Pattern1 pat = new Pattern1();
		pat.printPat();
	}
}