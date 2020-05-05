
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 20, 1000);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(2, 23, 1500);

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        System.out.println(manhattanStudioApt.moreExpensiveThan(bangorThreeBedroomApt));

    }
}
