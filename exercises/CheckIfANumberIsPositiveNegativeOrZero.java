import java.util.Scanner;

public class Solution {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        // Your code to determine if 'number' is positive, negative, or zero goes here
        int num = scanner.nextInt();
        if(num < 0){
            System.out.println("Negative");
        }
        else if(num > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }
        scanner.close();

    }

}