import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int m = scn.nextInt();
            ArrayList<Integer> sarr = new ArrayList<>();
            for(int j = 0;j<m;j++){
                int num = scn.nextInt();
                sarr.add(num);
            }
            arr.add(sarr);
        }
        int m = scn.nextInt();
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();        
        for(int i = 0;i<m;i++){
            ArrayList<Integer> sarr = new ArrayList<>();
            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            sarr.add(num1);
            sarr.add(num2);
            arr1.add(sarr);
        }
        for(int i = 0;i<m;i++){
            int row = arr1.get(i).get(0)-1;
            int ele = arr1.get(i).get(1)-1;
            if(arr.get(row).size() != 0 && arr.get(row).size()>ele){
                System.out.println(arr.get(row).get(ele));
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }
}