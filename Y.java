import java.util.Scanner;

class Y 
{
	public static void main(String[] args) 
	{
	System.out.println("no. to weord (1-19)");
	Scanner sc = new Scanner(System.in);
	String[] numNames = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen",
		"fifteen","sixteen","seventeen","eighteen","nineteen"};
	System.out.println("eneter a no. from 1 to 19");
	int i = sc.nextInt();
	String word = numNames[i];
	System.out.println(word);

	}
}
