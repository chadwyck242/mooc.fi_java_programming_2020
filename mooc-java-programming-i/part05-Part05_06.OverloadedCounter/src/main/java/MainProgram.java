
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter count = new Counter(15);
        
        count.increase();
        System.out.println(count);
        count.increase(10);
        System.out.println(count);
        count.increase(-10);
        System.out.println(count);
        count.decrease();
        System.out.println(count);
        count.decrease(11);
        System.out.println(count);
        count.decrease(-11);
        System.out.println(count);
    }
}
