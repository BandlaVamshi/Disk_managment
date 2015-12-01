package hello;
import java.util.Arrays;

import java.util.*;
import java.util.Scanner;

public class CSCAN {
    
	
	int pos;
	int[] arr = new int[1000];
	Random R = new Random();
	int n;
	public void main(int st,int end,int head) 
	{
	//	Scanner in = new Scanner(System.in);
		int m, inm;
		
		int[] b = new int[1000];
	
	/*	System.out.println("Give start : ");
		st = in.nextInt();
		
		System.out.println("Give end : ");
		end = in.nextInt();
		
		System.out.println("Give head position : ");
		head = in.nextInt();
		
		System.out.println("Enter number of elements in the queue : ");*/
		n = R.nextInt(10-0)+ 1;
		
		System.out.println("Enter the queue : ");
		for(int i=0 ;i<n ;i++)
			arr[i] = R.nextInt(end - st) +1;
		
		arr[n] = st;
		arr[n+1] = end;
		arr[n+2] = head;
		
		for (int c = 0; c < ( n+3 ); c++)
		{
		      for (int d = 0; d < n+2-c ; d++)
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
	
		for(int i=0; i< n+2; i++)
		{
			if (arr[i] == head )
				pos = i;
		}
		
		for(int i=pos; i>=0; i--)
			System.out.println(arr[i] + " ");
		for(int i=n+2; i >= pos+1; i--)
			System.out.println(arr[i] + " ");
	}

}
