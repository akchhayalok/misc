class E
{
	public static void main(String[] args) 
	{
		int i = 12345;
		int j =i;
		int sum =0;
		while(j !=0)
		{
			sum += j%10;
			j = j/10;
		}
		System.out.println("sum of the digits "+i+ "is "+sum);
	}
	
	
}
