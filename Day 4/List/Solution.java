import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        List<Integer> arr= new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            int val=scn.nextInt();
            arr.add(val);
        }
        int q = scn.nextInt();
        for(int j=0;j<q;j++)
        {
            String str=scn.next();
            if(str.equals("Insert"))
            {
                int x=scn.nextInt();
                int y=scn.nextInt();
                arr.add(x,y);
            }
            else
            {
                int x=scn.nextInt();
                arr.remove(x);
            }
        }

        for(int val:arr){
            System.out.print(val+" ");
        }

    }
}