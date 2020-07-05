
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        // Create a new instance of UserInterface
        UserInterface userInterface = new UserInterface(scanner, register);

        // Call the method to start the program from UserInterface
        userInterface.start();
    }
}
