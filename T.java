/*total no. of digits in a given no.*/
import java.util.Scanner;
class T 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int i = sc.nextInt();
		int  j =i;
		int digitsCount = 0;
		while(j!=0)
		{
			digitsCount++;
			j = j/10;
		}
		System.out.print("digit count in " +i );
		System.out.print(":" + digitsCount );

	}
}
