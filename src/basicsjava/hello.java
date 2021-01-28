package basicsjava;

import java.util.Scanner;

public class hello {
	public static void main(String []args)

	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {

		int[] arr=new int[n];
		int t,sum=0,j=0,f=0;
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		    if(arr[i]<=9) {
		        System.out.println("invalid");
		        f=1;
		        break;

		    }
		}
		if(f==0) {
		for(int i=0;i<arr.length;i++)
		{
			 t=arr[i];
			 sum =0;
			while(t>0) {
				sum=sum+t%10;
				t=t/10;
			}
			if(arr[i]%sum==0) {
		        System.out.println(arr[i]);
		        j++;
			}
			
				
			
		}
		if(j==0) {
	        System.out.println("no harshad number found");

		}
	}
		}
		else {
	        System.out.println("invalid input");

		}
	}

}
