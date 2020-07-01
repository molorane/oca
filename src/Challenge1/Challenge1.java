/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge1;

/**
 *
 * @author madw
 */
public class Challenge1 {
    
    public static void main(String[] args) {
        System.out.println(getDurationString(5000));
        System.out.println(getDurationString(500,50));
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours =  minutes / 60;
            int remainingMinutes = minutes % 60;
            return String.format("%dh %dm %ds", hours, remainingMinutes, seconds);
        } else {
            return "Invalid value";
        }
    }
    
    public static String getDurationString(int seconds) {
        if(seconds >= 0){
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
        return "Invalid value";
    }
}
