package InternshalaAssignment;
import java.util.*;
public class internshala{
	public static void leader(int[] arr,int n)
	{
		System.out.print(arr[n-1]+" ");
		int max=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				System.out.print(max+" ");
			}
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		leader(arr,n);
}
}
