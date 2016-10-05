/* finding 1st 5 perfect no.*/
class S 
{
	public static void main(String[] args) 
	{
		int j =0;
		int i =1;
		int divisibleSum =0;
		while(j <=5) 
		{
			divisibleSum =0;
		 for(int k =1; k <=(i/2);k++)
			{
			 if(i % k==0)
				{
				 divisibleSum +=k;
				}
			}
			if(divisibleSum==i)
			{
				System.out.println(i + "is a perfect no.");
				j++;
			}
				i++;
		}
			
	}
}
