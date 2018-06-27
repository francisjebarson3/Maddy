import java.util.*;
class LeapYear
{
    public static void main(String fran[])
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
       if(year%4==0)
       System.out.print("yes");
       else
       System.out.print("no");
    }
}
