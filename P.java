class P
{
	public static void main(String[] args) 
	{
		System.out.println("all prime nos between 5000 to 7000");
		//System.out.print(2 + ",");
		
		int j= 5000;
		boolean flag = true; 
		while( j<=7000)
		{
			for(int k =2;k <=(j/2);k++)
			{
				if(j % k==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.print(j + ",");
				
			}
			else
			{
				flag = true;
			}
			j++;
		}
		
	}
}
