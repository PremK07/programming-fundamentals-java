import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int month = sc.nextInt(); 
        
        // Write your code here
        if(month>12){
            System.out.println("invalid Input");
        }else if (month < 1){
            System.out.println("Invalid Input");
        }else{
            switch(month) {
                case 1,2,12:
                    System.out.println("Winter");
                    break;
                case 3,4,5:
                    System.out.println("Spring");
                    break;
                case 6,7,8:
                    System.out.println("Summer");
                    break;
                case 9,10,11:
                    System.out.println("Autumn");
                    break;
            }
        }

        sc.close(); 
    } 
}