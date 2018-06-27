import java.util.*;
class Large
{
    public static void main(String fran[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[arr.length-1]);
    }
}
