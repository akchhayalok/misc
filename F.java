
class F
{
	public static void main(String[] args) 
	{
		if(args.length==0)
		{
			System.out.println("supply command line arg ");
			System.out.println("java F 123");
			System.exit(0);
		}
		int i = Integer.parseInt(args[0]); //converting int to string;
		int j =i;
		int sum =0;
		while(j !=0)
		{
			sum += j%10;
			j = j/10;
		}
		System.out.println("sum of the digits " +i+ "is " +sum);
	}
	
	
}
