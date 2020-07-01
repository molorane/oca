/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondsMinutesChallenge;

/**
 *
 * @author madw
 */
public class NjabuloSolution {

    public String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMunites = minutes % 60;

        return hours + "h " + remainingMunites + "m " + seconds+"s";
    }

    public String getDurationString(long seconds) {

        if (seconds < 0) {
            return "Invalid value";
        }
        
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        
        return getDurationString(minutes, remainingSeconds);
    }
}
/*
0h 20m 0s
20h 0m 10s
*/
