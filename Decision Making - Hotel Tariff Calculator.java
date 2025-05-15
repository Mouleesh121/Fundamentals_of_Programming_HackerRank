import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt();
        int rentPerDay = sc.nextInt();
        int days = sc.nextInt();
        
        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
            return;
        }
        
        boolean peakSeason = (month >= 4 && month <= 6) || (month >= 11 && month <= 12);
        
        double totalRent;
        if (peakSeason) {
            totalRent = days * rentPerDay * 1.2;
        } else {
            totalRent = days * rentPerDay;
        }
        
        System.out.println((int)totalRent);
    }
}
