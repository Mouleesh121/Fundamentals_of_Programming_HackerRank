import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int digit1 = num % 10;        
        int digit2 = (num / 10) % 10; 
        int digit3 = (num / 100) % 10; 

        int reversed = digit1 * 100 + digit2 * 10 + digit3;

        System.out.println(reversed);
    }
}
