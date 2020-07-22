package lambda.lambda;
import java.util.*;
import java.util.function.*;
public class StartWithA {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		List<String> list=new ArrayList<>();
		for(int i=0;i<n;i++)
			list.add(sc.next());
		System.out.println(check(list,(String x)->x.charAt(0)=='a' && x.length()==3));
		sc.close();
	}
	public static List<String> check(List<String> list,Function<String,Boolean> function) {
		List<String> result=new ArrayList<>();
		for(String x:list)
		{
			if(function.apply(x))
				result.add(x);
		}
		return result;
	}
}
