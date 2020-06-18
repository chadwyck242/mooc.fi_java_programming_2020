
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;

        while (true) {

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            System.out.println("First: " + firstVolume + "/" + maxVolume);
            System.out.println("Second: " + secondVolume + "/" + maxVolume);

            if (command.equals("add") && amount >= 0) {
                if (firstVolume <= maxVolume) {
                    firstVolume += amount;
                    if (firstVolume > maxVolume) {
                        firstVolume = maxVolume;
                    }

                }
            } else if (command.equals("move") && amount >= 0) {
                if ((firstVolume - amount) >= 0) {
                    secondVolume += amount;
                    firstVolume -= amount;
                    if (secondVolume >= maxVolume) {
                        secondVolume = maxVolume;
                    }
                } else if ((firstVolume - amount) < 0) {
                    secondVolume += firstVolume;
                    firstVolume = 0;
                    if (secondVolume >= maxVolume) {
                        secondVolume = maxVolume;
                    }
                }
            } else if (command.equals("remove") && amount >= 0) {
                if ((secondVolume - amount) >= 0) {
                    secondVolume -= amount;
                } else if ((secondVolume - amount) < 0){
                    secondVolume = 0;
                }
            }

        }

        System.out.println("First: " + firstVolume + "/" + maxVolume);
        System.out.println("Second: " + secondVolume + "/" + maxVolume);
    }

}
