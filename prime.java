/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,m=0,flag=0;
		Scanner in=new Scanner (System.in);
		n=in.nextInt();
		m=n/2;
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			++flag;
		}
		if(flag==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
