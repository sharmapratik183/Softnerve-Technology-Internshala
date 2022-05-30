package InternshalaAssignment;
import java.util.*;
public class Question3 {
	public static int sum(int[] arr,int n)
	{
		int xorsum=0;
		for(int i=0;i<n;i++)
		{
			xorsum|=arr[i];
		}
		int xorTotalSum=xorsum*(int)Math.pow(2, n-1);
		return xorTotalSum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int xorTotalSum=sum(arr,n);
		System.out.println(xorTotalSum);
		


	}

}
