
public class Main {

    public static void main(String[] args) {

        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        
        Package gobble = new Package();
        gobble.addGift(book);
        System.out.println(gobble.totalWeight());
    }
}
