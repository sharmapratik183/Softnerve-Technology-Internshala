package InternshalaAssignment;
import java.util.*;
public class Question2 {
	public static int maximumProfit(int[] prices,int n)
	{
		int minimum=prices[0];
		int mp=0;
		for(int i=0;i<n;i++)
		{
			minimum=Math.min(prices[i],minimum);
			int profit=prices[i]-minimum;
			mp=Math.max(mp, profit);
		}
		return mp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prices[]=new int[n];
		for(int i=0;i<n;i++)
			prices[i]=sc.nextInt();
		int mp=maximumProfit(prices,n);
		System.out.println(mp);

	}

}
