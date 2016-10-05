/*armstrong no.*/
class W
{
	public static void main(String[] args) 
	{
		/* finding out armstrong no.*/
		//153 is an armstrong no.//
		//153 = 1*1*1 + 5*5*5 + 3*3*3;
		int i=1;
		int count =0;
		System.out.println("1st 3 armstrong no.");
		while(count<4)
		{
		int j = i;
		int k = i;
		int digitsCount=0;
		while(j!=0)
		{
			digitsCount++;
			j = j/10;
		}
		int sum=0,digit=0,value =0;
		while(k!=0)
		{
			digit = k%10;
			value = 1;
			for(int m =1;m<=digitsCount;m++)
			{
				value *=digit;
			}
			sum +=value;
			k = k/10;
		}
		if(i ==sum)
			{
		System.out.println(i +" is an armstrong  no.");
		j++;
		count++;
			}
		}
		
	}
}
