import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        // Take help of Scanner to take input 
        Scanner sc = new Scanner(System.in); 
        
        // Write your code here 
        // Display the result according to the given inputs
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if(b==0){
                    System.out.println("Error: Division by zero");
                }else{
                    System.out.println(a/b);
                }
                break;
            default:
            System.out.println("Invalid operation");
        }

        sc.close(); 
    } 
}