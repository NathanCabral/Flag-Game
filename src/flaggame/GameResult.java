/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flaggame;
import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 *
 * @author Nathan Cabral
 */
public class GameResult
{
    String dateTaken;
    String timeTaken;
    int score;
    int year;
    int month;
    int day;
    int hour;
    int second;
    int minute;
    public static GameResult studentResult = new GameResult();
    
    public void studentScore(int stdScore)
    {
        score = stdScore;
    }
    
    public String dateAndTimeCompilation()
    {
        date();
        time();
        String fullDateAndTime = (dateTaken + "    "+ timeTaken);
        System.out.println(fullDateAndTime);
        return fullDateAndTime;
    }
    
    public void date()
    {
       Calendar quizDate = new GregorianCalendar(); 
       year = quizDate.get(Calendar.YEAR);
       day = quizDate.get(Calendar.DAY_OF_MONTH);
       month = quizDate.get(Calendar.MONTH);
       
       dateTaken = (day + "/" + month + "/" + year);
    }
    
      
    public void time()
    {
        Calendar quizTime = new GregorianCalendar();
        hour = quizTime.get(Calendar.HOUR_OF_DAY);
        minute = quizTime.get(Calendar.MINUTE);
        second = quizTime.get(Calendar.SECOND);
        
        timeTaken = (hour +":"+ minute + "." + second);
        
    }
}
