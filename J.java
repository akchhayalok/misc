import java.util.Scanner;
class J

{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any no");
		int i =sc.nextInt();
		int middle = i/2;
		boolean isPrime=true;
		for(int j=2;j<=middle;j++)
		{
			if(i%j==0)
			{
				isPrime = false;
				break;
			}
		}
			
		System.out.println(i + " is a prime:"+isPrime);

			
		
	}
}
