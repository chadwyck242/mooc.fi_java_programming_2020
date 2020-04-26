/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chadsisk
 */
public class Gauge {

    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (this.value < 5) {
            value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            value--;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }
}
