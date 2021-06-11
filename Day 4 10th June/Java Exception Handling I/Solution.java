import java.util.*;
public class Solution {
    public static void main(String[] args) {
        
        try (Scanner scn = new Scanner(System.in)) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int res = a/b;
            System.out.println(res); 
        } 
        catch (InputMismatchException e) {
            // e.printStackTrace();
            System.out.println("java.util.InputMismatchException");
    
        } 
        catch (ArithmeticException e) {   
            // e.printStackTrace();
            System.out.println("java.lang.ArithmeticException: / by zero");
        } 
    }
}
