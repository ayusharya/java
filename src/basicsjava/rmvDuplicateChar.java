package basicsjava;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class rmvDuplicateChar {
	public static void main(String []args)

	{
	Scanner sc=new Scanner(System.in);
	String str= sc.nextLine(); 
	String[] words = str.split("\\s+");
	for(int i=0;i<words.length;i++) {	
		StringBuffer sb=new StringBuffer(words[i]);  
		String s=words[i];
		int l=sb.length();
		for(int j=0; j<l;j++) {
			for(int k=j+1; k<l;k++) {
			if(sb.charAt(j)==sb.charAt(k)) {
				String s1=s.replaceAll(s.substring(j, j+1),  "");
				StringBuffer	sb1 = new StringBuffer(s1);
                sb=sb1;
                s=sb.toString();
				l=sb.length();
			}
		}
			if(i==words.length -1)
				words[i]=sb.toString();
			else
			words[i]=sb.toString()+" ";
		}

	}
	StringBuffer sb = new StringBuffer();
    for(int i = 0; i < words.length; i++) {
       sb.append(words[i]);
    }
    String str1 = sb.toString();
    System.out.println(str1);
}
}
