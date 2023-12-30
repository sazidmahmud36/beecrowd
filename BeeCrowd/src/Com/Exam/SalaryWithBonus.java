
package Com.Exam;
import java.util.Scanner;
public class SalaryWithBonus {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        String name = userInput.nextLine();
        float sold = userInput.nextFloat();
        float salary = userInput.nextFloat();
        double bonus = salary*0.15;
        double total = sold + bonus;
        
        System.out.printf("TOTAL = R$ %.2f\n", total);
        
        
    }
}
