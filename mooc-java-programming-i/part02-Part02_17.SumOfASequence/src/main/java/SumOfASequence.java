
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int limit = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);

    }
}
