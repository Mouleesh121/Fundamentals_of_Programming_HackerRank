import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCoins = sc.nextInt();
        int benPercent = sc.nextInt();
        int blackbeardPercent = sc.nextInt();

        int benShare = (totalCoins * benPercent) / 100;

        int remainingAfterBen = totalCoins - benShare;

        int blackbeardShare = (remainingAfterBen * blackbeardPercent) / 100;

        int remainingAfterBlackbeard = remainingAfterBen - blackbeardShare;


        int piratesShare = remainingAfterBlackbeard / 3;

        System.out.println(benShare);
        System.out.println(blackbeardShare);
        System.out.println(piratesShare);
    }
}
