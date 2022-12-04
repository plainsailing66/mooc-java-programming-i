/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
public class Timer {
    private ClockHand h_seconds;
    private ClockHand seconds;
    
    public Timer() {
        this.h_seconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.h_seconds.advance();
        
        if (this.h_seconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return seconds + ":" + h_seconds;
    }
}
