
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int num1 = Integer.valueOf(scanner.nextLine());

//        for (int i = 1; i <= num1; i++) {
//            System.out.println(i);
//        }

        System.out.println("Where from?");
        int num2 = Integer.valueOf(scanner.nextLine());

        if (num2 <= num1) {
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("");
        }
    }
}
