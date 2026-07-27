import java.util.Scanner; 
public class Solution { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        
        // Don’t write System.out.println() statements to enter the  data 
        
        // Write your code here 
        // Calculate and print the price according to the question
        int cost = sc.nextInt();
        int quantity = sc.nextInt();
        double discount = sc.nextDouble();

        int totalCost = cost * quantity;
        double discountAmount = (totalCost * discount)/100;
        double finalPrice = totalCost - discountAmount; 
        System.out.println((int)finalPrice);


        sc.close(); 
    } 
}