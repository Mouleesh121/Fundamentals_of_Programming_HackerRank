import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int firstDigit = num / 1000;
        int lastDigit = num % 10;
        System.out.println(firstDigit + lastDigit);
    }
}
