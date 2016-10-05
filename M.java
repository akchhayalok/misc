class M
{
	public static void main(String[] args) 
	{
		System.out.println("sum of initial 20 prime numbers");
		//System.out.print(2 + ",");
		int i= 0;
		int j= 2;
		int sum=0;
		boolean flag = true; 
		while(i<=20)
		{
			for(int k =2;k <(j/2);k++)
			{
				if(j % k==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				sum+=j;
				
				
				i++;
			}
			else
			{
				flag = true;
			}
			j++;
		}
			
			System.out.println("sumof nos "+sum);
		
		
	}
}
