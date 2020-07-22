package lambda.lambda;

import java.util.*;
import java.util.function.*;

public class Average {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		System.out.println(list.stream().mapToInt((x)->x).average().orElse(Double.NaN));
		//using lambdas
		System.out.println(avg(list,(Integer x)->x.intValue()));
		sc.close();
	}
	public static double avg(List<Integer> list,Function<Integer,Integer> function) {
		double sum=0;
		for(Integer i:list)
			sum+=function.apply(i);
		sum/=list.size();
		return sum;
		
	}
	
}

