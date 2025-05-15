import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double cost = 0;
        
        if (units <= 200) {
               cost = units * 0.5;
        } else if (units <= 400) {
            cost = units * 0.65 + 100;
        } else if (units <= 600) {
            cost = units * 0.80 + 200;
        } else {
            cost = units * 1.25 + 425;
        }
        
        // Print the result as integer Rupees with prefix Rs.
        System.out.println("Rs." + (int)cost);
    }
}
