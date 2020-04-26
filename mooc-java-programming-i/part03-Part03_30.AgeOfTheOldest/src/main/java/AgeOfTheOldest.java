
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            age = Integer.valueOf(data[1]);
            if (age > oldest) {
                oldest = age;
            }
        }

        System.out.println("Age of the oldest: " + oldest);

    }
}
