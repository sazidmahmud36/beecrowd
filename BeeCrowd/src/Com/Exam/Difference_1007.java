
package Com.Exam;
import java.util.Scanner;

public class Difference_1007 {
     public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        int A = userInput.nextInt();
        int B = userInput.nextInt();
        int C = userInput.nextInt();
        int D = userInput.nextInt();
        
        int result = diff(A,B,C,D);
        
        System.out.println("DIFERENCA = " + result);
        
        
     
    }
     
     public static int diff(int number1, int number2, int number3, int number4){
         int difference = (number1*number2)-(number3*number4);
         return difference;
     }
}
