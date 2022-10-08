
package Model;

public class OneSecond {
    private int hours,minutes,seconds,hoursR,minutesR,secondsR;
    String error="";
    boolean errorB= false;

    public OneSecond() {
        hours=0;
        minutes=0;
        seconds=0;
    }
    
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getHoursR() {
        return hoursR;
    }
    public void setHoursR(int hoursR) {
        this.hoursR = hoursR;
    }
    public int getMinutesR() {
        return minutesR;
    }
    public void setMinutesR(int minutesR) {
        this.minutesR = minutesR;
    }
    public int getSecondsR() {
        return secondsR;
    }
    public void setSecondsR(int secondsR) {
        this.secondsR = secondsR;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public boolean isErrorB() {
        return errorB;
    }

    public void OneSecondF(){
        
        if (hours==23 && minutes==59 && seconds==59 ){
            hoursR=minutesR=secondsR=0;
        }
        if(minutes==59 && seconds==59){
            hoursR=hours+1;
            minutesR=0;
            secondsR=0;
        }else if(seconds==59){
            minutesR=minutes+1;
            secondsR=0;
        }else{
            secondsR=seconds+1;
            minutesR=minutes;
            hoursR=hours;
        }
    }

    public void Error(){
        if (hours>23){
            error="Las horas deben estar entre 0 y 23,por favor digite un número valido";
            errorB=true;
        }else if(minutes>59){
            error="Los minutos deben estar entre 0 y 59,por favor digite un número valido";
            errorB=true;
        }else if(seconds>59){
            error="Los segundos deben estar entre 0 y 59,por favor digite un número valido";
            errorB=true;
        }
    }
}
