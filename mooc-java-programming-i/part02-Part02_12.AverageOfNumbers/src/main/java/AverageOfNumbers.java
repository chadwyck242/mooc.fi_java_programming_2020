
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int values = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number != 0) {
                values = values + 1;
                sum = sum + number;
            }
        }

        double average = (sum * 1.0) / values;
        System.out.println("Average of the numbers: " + average);

    }
}
