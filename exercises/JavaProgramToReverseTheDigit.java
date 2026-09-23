import java.util.Scanner; 

public class Solution { 

    public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in); 

    // Write your code here 
    int n = scanner.nextInt();
    int reverse = 0;
    while(n != 0){
        int digit = n % 10;
        reverse =reverse * 10 + digit;
        n =n/10;
    }
    System.out.println(reverse);

    scanner.close(); 
   } 

} 