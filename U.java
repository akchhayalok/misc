/*armstrong no.is no. 
153=1^3+5^3+3^3*/
import java.util.Scanner;
class U 
{
	public static void main(String[] args) 
	{
		int n,sum =0, temp,remainder,digits =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("to check armstrong no.");
		n = sc.nextInt();
		temp =n;
		while(temp!=0)
		{
			digits++;
			temp= temp/10;
		}
		temp =n;
		while(temp!=0)
		{
			remainder= temp%10;
			sum=sum+power(remainder,digits);
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println(n +" is a armstrong number");
		}
		else
		{
			System.out.println(n +" is not a armstrong number");
		}
	}
		static int power(int n,int r)
		{
			int c,p=1;
			for(c =1;c <=r;c++)
			{
				p=p*n;
			}
				return p;
		}
	
	
}
