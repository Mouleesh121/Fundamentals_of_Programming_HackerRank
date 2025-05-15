import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int treeNum = sc.nextInt();
        
        int row = (treeNum - 1) / cols + 1;
        int col = (treeNum - 1) % cols + 1;
        
        if (row == 1 || col == 1 || col == cols) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
