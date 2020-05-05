/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chadsisk
 */
public class Counter {

    private int counter;

    public Counter(int startValue) {
        this.counter = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.counter;
    }

    public void increase() {
        this.counter++;
    }

    public void decrease() {
        this.counter--;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.counter = this.counter + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.counter = this.counter - decreaseBy;
        }
    }
    
    @Override
    public String toString(){
        return "Count: " + this.counter;
    }
}
