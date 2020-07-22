package lambda.lambda;
import java.util.*;
import java.util.function.*;
public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		List<String> list=new ArrayList<>();
		for(int i=0;i<n;i++)
			list.add(sc.next());
		palList(list,(String x)->isPal(x));
		sc.close();
	}
	public static boolean isPal(String x)
	{
		int l=0,h=x.length()-1;
		while(l<=h)
		{
			if(x.charAt(l)!=x.charAt(h)) return false;
			l++;
			h--;
		}
		return true;
	}
	public static void palList(List<String> list,Function<String,Boolean> function)
	{
		List<String> palin=new ArrayList<>();
		List<String> notPalin=new ArrayList<>();
		for(String x:list)
		{
			if(function.apply(x))
				palin.add(x);
			else notPalin.add(x);
		}
		System.out.println("Palindrome strings are:\n"+palin+"\nNon palindromic strings are:\n"+notPalin);
	}
	
}

