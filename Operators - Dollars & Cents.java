import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dollar1 = sc.nextInt();
        int cent1 = sc.nextInt();

        int dollar2 = sc.nextInt();
        int cent2 = sc.nextInt();

        int totalCents = cent1 + cent2;
        int totalDollars = dollar1 + dollar2 + (totalCents / 100);
        totalCents = totalCents % 100;

        System.out.println(totalDollars);
        System.out.println(totalCents);
    }
}
