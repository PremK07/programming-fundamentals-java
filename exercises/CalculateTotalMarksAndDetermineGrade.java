import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        int s4 = scanner.nextInt();
        int s5 = scanner.nextInt();
         
         if (s1 < 0 || s1 > 100 ||
            s2 < 0 || s2 > 100 ||
            s3 < 0 || s3 > 100 ||
            s4 < 0 || s4 > 100 ||
            s5 < 0 || s5 > 100) {

            System.out.println("Invalid input");

        } else {
       
        int totalMarks = s1 + s2 + s3 + s4 + s5;
       
        System.out.println("Total Marks: "+ totalMarks);
       
        if(totalMarks >= 450){
            System.out.println("Grade: A");
        }
        else if(totalMarks >= 400){
            System.out.println("Grade: B");   
        }
        else if(totalMarks >= 350){
            System.out.println("Grade: C");
        }
        else if(totalMarks >= 300){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
        scanner.close();
    } 
}

}