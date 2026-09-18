import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // write your code here
        String membership = scanner.next();
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount");
        }
        else {
            switch (membership) {
                case "Gold":
                    amount = amount - (amount * 30 / 100);
                    System.out.println("Final Amount after Discount: " + amount);
                    break;

                case "Silver":
                    amount = amount - (amount * 20 / 100);
                    System.out.println("Final Amount after Discount: " + amount);
                    break;

                case "Regular":
                    amount = amount - (amount * 7 / 100);
                    System.out.println("Final Amount after Discount: " + amount);
                    break;

                default:
                    System.out.println("Invalid membership");
            }
        }

        scanner.close();

    }

}