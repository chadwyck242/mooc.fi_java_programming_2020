
import java.util.ArrayList;

public class Statistics {

    private int count;
    private int sum;

    private final ArrayList<Integer> list = new ArrayList<>();

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count += 1;
        this.list.add(number);

        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        this.sum = total;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        if (this.count == 0) {
            return 0;
        } else {
            return this.sum;
        }
    }

    public double average() {
        double average;
        if (this.count == 0) {
            average = 0;
        } else {
            average = 1.0 * this.sum / this.count;
        }

        return average;
    }
}
