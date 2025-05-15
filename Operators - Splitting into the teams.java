import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalFriends = sc.nextInt();
        int numberOfTeams = sc.nextInt();

        int friendsInEachTeam = totalFriends / numberOfTeams;
        int leftOut = totalFriends % numberOfTeams;

        System.out.println("The number of friends in each team is " + friendsInEachTeam + " and left out is " + leftOut);
    }
}
