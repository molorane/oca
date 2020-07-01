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
public class MothusiSolution {

    public String getDurationString(int minutes, int seconds) {
        
        if (minutes >= 0) {
            
            if (seconds >= 0 && seconds <= 59) {
                
                int hours  = (minutes > 60) ? minutes / 60 : 0;
                minutes %= 60;   
                return hours+"h "+minutes+"m "+seconds+"s";
            }
        }

        return "invalid value";
    }

    public String getDurationString(int seconds) {
        String str = "";

        if (seconds >= 0) {

            int munites = (seconds > 60) ? seconds / 60 : 0;
            seconds %= 60;
            
            return getDurationString(munites, seconds);
        }

        return "invalid value";
    }
}
