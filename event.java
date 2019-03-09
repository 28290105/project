/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int n,m,i;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		m=in.nextInt();
		for(i=n+1;i<m;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}

	}
}
