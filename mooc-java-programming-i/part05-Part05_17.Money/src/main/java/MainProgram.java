
public class MainProgram {

    public static void main(String[] args) {

        Money a = new Money(10, 0);
        Money b = new Money(3, 0);
        Money c = new Money(5, 0);

        System.out.println(a.lessThan(b));  // false
        System.out.println(b.lessThan(c));  // true

    }
}
