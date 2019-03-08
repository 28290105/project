/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int b,e;
		long result=1;
		Scanner in=new Scanner(System.in);
		b=in.nextInt();
		e=in.nextInt();
		while(e!=0)
		{
			result=result*b;
			e--;
		}
		System.out.println(result);
	}
}
