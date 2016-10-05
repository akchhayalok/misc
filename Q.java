class Q
{
	public static void main(String[] args) 
	{
		System.out.println("all prime nos upto 500 in reverse order");
		//System.out.print(2 + ",");
		
		int j= 500;
		boolean flag = true; 
		while( j>1)
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
			j--;
		}
		
	}
}
