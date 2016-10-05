/* finding out given o, is perfect or not
1+2+3=6; so 6 is a perfect no
28
1+2+4+7+14=28*/
class R
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int i = sc.nextInt();
		int divisiblesSum = 0;
		for(int k =1;k < =(i/2); k++)
		{
			if(i %k ==0)
			{
				divisiblesSum+=k;
			}
		}
		if(divisiblesSum ==i)
		{
		System.out.println(i+"is perfect number");
		}
		else
		{
			System.out.println(i+"is not a perfect number");
		
		}
	}
}
		
		
	

