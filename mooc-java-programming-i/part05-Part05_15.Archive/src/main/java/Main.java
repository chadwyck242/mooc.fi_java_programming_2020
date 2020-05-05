
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive item = new Archive(identifier, name);
            if (items.contains(item)) {
                continue;
            } else {
                items.add(item);
            }

        }

        System.out.println("==Items==");

        for (Archive entry : items) {
            System.out.println(entry.getIdentifier() + ": " + entry.getName());
        }

    }
}
