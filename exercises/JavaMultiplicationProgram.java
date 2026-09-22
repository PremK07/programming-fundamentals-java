import java.util.Scanner; 

    public class Solution { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        // Your code here 
        long num = scanner.nextLong();

        if(num <=0){
            System.out.println("Invalid Input");
        }else{
            System.out.println("Multiplication Table of " + num + ":");

            for(int i = 1; i<= 10; i++){
                System.out.println(num + " * "+ i + " = "+ num*i);
            }
        }

        scanner.close(); 

    } 

} 