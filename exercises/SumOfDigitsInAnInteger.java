import java.util.Scanner; 

public class Solution{ 

    public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in); 

    // Write your code here 
    int num = scanner.nextInt();
    int sum = 0;
    while(num > 0){
        sum =sum + num % 10;
        num= num / 10;
    }
    System.out.println(sum);

    scanner.close();   

    } 

} 