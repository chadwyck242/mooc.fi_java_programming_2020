
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());

        for (int i = num; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
