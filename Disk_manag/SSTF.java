package hello;
import java.util.*;

public class SSTF 
{
	int[] arr = new int[1000];
	int[] b = new int[1000];
	int n;
	public void main(int st,int end,int head)
	{
//		Scanner in = new Scanner(System.in);
		int  m, inm;
		
		Random R = new Random();
          	
		/*System.out.println("Give start : ");
		st = in.nextInt();
		
		System.out.println("Give end : ");
		end = in.nextInt();
		
		System.out.println("Give head position : ");
		head = in.nextInt();
		
		System.out.println("Enter number of elements in the queue : ");*/
	int 	range = 10;
		n = R.nextInt(10 - 0) +1;
		
//		System.out.println("Enter the queue : ");
		for(int i=0 ;i<n ;i++)
			arr[i] = R.nextInt(end-st)+ 1;
	
		for(int i=0;i<n;i++)
		{
			m = 10000000;
			inm = 0;
			
			for(int j=0 ;j<n ;j++)
			{
				if( Math.abs(head-arr[j]) < m )
				{
					m = Math.abs(head-arr[j]);
					inm =j;
				}
			}
			b[i] = arr[inm];
			head = b[i];
			arr[inm] = 10000;
		}
		
	//	for(int i=0;i<n;i++)
		//	System.out.println(b[i] + " ");
		//System.out.println("");
		
	}	
}