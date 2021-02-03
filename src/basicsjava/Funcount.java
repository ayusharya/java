package basicsjava;
import java.util.*;
public class Funcount {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String a[]=new String[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.next();
	}
int c=1;
	for(int i=0;i<a.length;i++)
	{
		c=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i].equals(a[j]))
			{
				c=c+1;
				a[j]="";
			}
		}
		if(a[i]!="")
		{
		System.out.println(a[i]+"="+c);
		}
	}
}
}
