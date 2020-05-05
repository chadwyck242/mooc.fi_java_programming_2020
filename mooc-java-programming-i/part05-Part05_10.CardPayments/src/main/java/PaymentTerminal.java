
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.00;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 2.50) {
            this.affordableMeals += 1;
            this.money += 2.50;
            payment -= 2.50;
            return payment;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 4.30) {
            this.heartyMeals += 1;
            this.money += 4.30;
            payment -= 4.30;
            return payment;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            this.affordableMeals += 1;
            card.takeMoney(2.50);
            return true;
        }

        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            this.heartyMeals += 1;
            card.takeMoney(4.30);
            return true;
        }

        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            this.money = this.money + sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
