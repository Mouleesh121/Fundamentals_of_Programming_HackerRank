import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        int roundedDown = (int)Math.floor(num);
        int roundedUp = (int)Math.ceil(num);

        System.out.println(roundedDown);
        System.out.println(roundedUp);
        System.out.println(roundedDown);
    }
}
