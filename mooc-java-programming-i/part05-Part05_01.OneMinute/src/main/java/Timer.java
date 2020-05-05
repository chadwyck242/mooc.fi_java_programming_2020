/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chadsisk
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundredths;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }
    
    public void advance() {
        this.hundredths.advance();
        
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return seconds + ":" + hundredths;
    }
}
