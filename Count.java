import java.util.*;
class Count
{
    public static void main(String fran[])
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        int count=0;
       for(int i=0;i<input.length();i++)
       {
           count=count+1;
       }
      System.out.println(count);
    }
}
