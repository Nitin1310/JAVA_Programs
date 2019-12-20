class Count_Dup_Str_Char
{
	public void display()
	{
		String str = "khkffdsnkcndkhkknkv";
		int cnt ,k,n;
		cnt = 0;
		k=0;
		n=0;
		char[] inp = str.toCharArray();
		System.out.println("Duplicate Characters are:");
		for (int i = 0; i < str.length(); i++) {
			if (i== str.length()-1)	{
				for (int j =i-n; j < str.length(); j++) {
					n=0;
					if (inp[i] == inp[j]){
						cnt++;
					}
					else if(inp[i] != inp[j])
						break;
					k=j;
				}
				if(cnt >1 ){
					System.out.print(cnt);
					System.out.print( inp[i]);
					cnt = 0;
				}
				else if(cnt==1)
					System.out.print(inp[i]);	
					cnt = 0;
			}
			else if(inp[i]==inp[i+1])
			{
				cnt = 0;
				n++;
			}
			else{
				for (int j =i-n; j < str.length(); j++) {
					n=0;
					if (inp[i] == inp[j]){
						cnt++;
					}
					else if(inp[i] != inp[j])
						break;
					k=j;
				}
				if(cnt >1 ){
					System.out.print(cnt);
					System.out.print( inp[i]);
					cnt = 0;
				}
				else if(cnt==1)
					System.out.print(inp[i]);	
					cnt = 0;
			}
		}
		
	}
	public static void main(String args[])
	{
		//String s= "aabcccdeefghiccc";
		Count_Dup_Str_Char p = new Count_Dup_Str_Char();
		p.display();
	}

}