class N 
{
	public static void main(String[] args) 
	{
		int i =0;
		int j= 2;
		sum = 0;
		boolean flag =true;
		while(i<20)
		{
			for(int k =2;k<=(j/2);k++)
			{
				if(j % k ==0)
				{
					flag =false;
					break;
				}
			}
			if(flag)
			{
				sum+=j;
				//System.out.print(j + ",");
				i++;
			}
			else
			{
				flag = true;
			}
			j++;
		}
	

	
	}
}
