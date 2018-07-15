import java.util.*;
import java.lang.*;

public class PreFix
{  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String S[]=new String[N];
        for(int i=0;i<S.length;i++)
        {
            S[i]=sc.next();
        }
        System.out.print(longestCommonPrefix(S));
     }
    public static  String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) 
        return "";
    String pre = strs[0];
    for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(pre) != 0) {
            pre= pre.substring(0, pre.length() - 1);
            if (pre.isEmpty()) 
                return "";
        }        
    return pre;
}
}
