import java.util.*;
class NthChar
{
    public static void main(String fran[])
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
         int n=sc.nextInt();
        char N[]=input.toCharArray();
      int len=N.length;
      System.out.println(N[len-n]);
    }
}
