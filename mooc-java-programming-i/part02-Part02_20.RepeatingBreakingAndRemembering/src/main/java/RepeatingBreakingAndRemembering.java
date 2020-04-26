
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int validNumbers = 0;
        double average;
        int evenNumber = 0;
        int oddNumber = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (number % 2 == 0) {
                evenNumber++;
            }

            if (number % 2 != 0) {
                oddNumber++;
            }

            sum += number;
            validNumbers++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + validNumbers);
        average = ((sum * 1.0) / validNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumber);
        System.out.println("Odd " + oddNumber);

    }
}
