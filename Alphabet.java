import java.util.*;
import java.lang.*;
import java.io.*;
class Alphabet
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String S=s.next();
		String A="abcdefghijklmnopqrstuvwxyz";
		if(A.contains(String.valueOf(S)))
		System.out.print("Alphabet");
		
	}
}
