class H 
{
	public static void main(String[] args) 
	{
		int i =12345;
		int j =i;
		int k = 0;
		while(j!=0)
		{
			k= (k*10) +j %10;
			j = j/10;
		}
		System.out.println("reverse of " + i + " is " + k);
	}
}
