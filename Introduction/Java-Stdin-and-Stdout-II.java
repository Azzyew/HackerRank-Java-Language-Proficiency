import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your code here.
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String dale = sc.nextLine();
        
        sc.close();

        System.out.println("String: " + dale);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}