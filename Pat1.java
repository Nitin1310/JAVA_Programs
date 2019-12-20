class Pat1
{
	public void display(int z)
	{
		int a,c,temp;
		a=1;
		temp=0;
		c=0;
		for(int i=0; i<z;i++)
		{
			
			if(i==0){
				System.out.println(a);
				temp=a;
				a=a+a;
				c=a;
			}
			else{
				for(int j=0;j<a;j++)
				{
					System.out.print(a);
					
				}
				//System.out.println(a);
				System.out.print("\n");
				c=a;
				a=a+temp;
				
				temp=c;
			}
		}
	}
	public static void main(String args[])
	{
		Pat1 p = new Pat1();
		p.display(6);
	}

}