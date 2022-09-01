package AmazonInterviewSeries;

/*
 * Finding Missing element in a array without sorting in O(N) time*/
public class MissingNumber {
	
	public static int getMissingNumber(int[] arr, int n)
	{
		int sum = ((n+1)*(n+2))/2;
		int total = 0;
		for(int i = 0; i < n;i++)
			sum -= arr[i];
		
		return sum;
	}
	
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,7};
		System.out.println(getMissingNumber(arr,arr.length));
	}
}
