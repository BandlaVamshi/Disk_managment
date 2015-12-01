package hello;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class FCFS {
	public int[] arr = new int[1000];
  int n;
	public  void main(int st,int end,int head) 
	{
		Scanner in = new Scanner(System.in);
		int  m, inm;
		int[] b = new int[1000];
        Random R = new Random();
        
	//	System.out.println("Give start : ");
//		st = in.nextInt();
		
	//	System.out.println("Give end : ");
	//	end = in.nextInt();
		
	//	System.out.println("Give head position : ");
	//	head = in.nextInt();
		
	//	System.out.println("Enter number of elements in the queue : ");
	//	n = in.nextInt();
		//int st;
	//	st = R.nextInt(10-0)+1;
		System.out.print("Head" + " ");
		System.out.print(st);
		System.out.print("End");
		System.out.print(end + " ");
	//	int head = R.nextInt(50-10) + 1;
		int range = 10;
		n = R.nextInt(range-st)+1;
		
	//	System.out.println("Enter the queue : ");
		for(int i=0 ;i<n ;i++)
			arr[i] = R.nextInt(end-st)+ 1;
		
		arr[n] = head;
		
		for (int c = 0; c < ( n + 1 ); c++)
		{
		      for (int d = 0; d < n-c ; d++)
		      {
		        if (arr[d] > arr[d+1]) /* For descending order use < */
		        {
		          int swap = arr[d];
		          arr[d]   = arr[d+1];
		          arr[d+1] = swap;
		        }
		      }
		}
		
	/*	for(int i= 0;i < n+2; i++)
			System.out.println(arr[i] +" ");*/
		int pos = 0;
		for(int i=0; i< n+1; i++)
		{
		//	System.out.println(arr[i] + " ");
			//if (arr[i] == head )
			//	pos = i;
		}
		
	//	for(int i=pos; i>=0; i--)
	//		System.out.println(arr[i] + " ");
    //		for(int i=n; i>pos; i--)
    //			System.out.println(arr[i] + " ");
	}

}