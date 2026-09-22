import java.util.Scanner; 

  

public class Solution { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        // write your code here 
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum =0;
        if(start > end){
            System.out.println("Starting number must be smaller than ending number");
        }else{
            for(int i=start; i<=end; i++){
                if(i % 2 == 0){
                    sum += i;
                }
            }
            System.out.println(sum);
        }

        scanner.close(); 

    } 

} 