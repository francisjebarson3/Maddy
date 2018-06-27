import java.util.*;
class SumFirst
{
    public static void main(String fran[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int Upto=sc.nextInt();
        int sum=0;
       for(int i=0;i<=N;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(int i=0;i<=Upto;i++)
       sum=sum+arr[i];
      System.out.println(sum);
    }
}
