/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flaggame;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Nathan Cabral
 */
public class GameData
{
    public static GameData FG = new GameData();
    public static ArrayList<String> quizResults = new ArrayList<String>();
    public static ArrayList<Flag> flags = new ArrayList<Flag>();
    File gameInput = new File("FlagGameResults.txt");
    File flagInput = new File("FlagList.txt");
    Scanner input = null;
    Scanner gameResults = null;
    String flagName;
    Flag question;
    String[] currentFlagArray= {"","","",""};
    String countryName;
    String result;
    String filePath;
    String answer;
    String[] flagNames = new String[197];
    
    Random numGenerator = new Random();
 
    
    public void getGameData()
    {
        int counter = 0;
        try{
            input = new Scanner(new BufferedReader(new FileReader(flagInput)));
        }
        catch(Exception noFileFound)
        {
            System.out.println("File Not Found");
        }
        while(input.hasNextLine())
        {
               countryName = input.nextLine();
               filePath = countryName+".png";
               
               flagNames[counter] = countryName;
               flags.add(new Flag(countryName, filePath));
              
               counter = counter + 1;
               
        }
       
    }
    public void loadGameResults()
   {
       try{
            gameResults = new Scanner(new BufferedReader(new FileReader(gameInput)));
        }
        catch(Exception noFileFound)
        {
            System.out.println("File Not Found");
        }
        while(gameResults.hasNextLine())
        {
               result = gameResults.nextLine();
               quizResults.add(result);
        }
        for(String i : quizResults)
        {
            System.out.println(i);
        }
   }
    public Flag getRandomFlag()
    {
        int randNum = numGenerator.nextInt(flags.size());
        Flag temp = flags.get(randNum);
//        System.out.println(temp.getFlagInfo()+ "test 1");
        return temp;
    }
    
    public void flag()
    {
        question = getRandomFlag();
        flagName = question.fcountryName;
        
    }
    public Flag getFlag()
    {
        return question;
    }
    public String getFlagName()
    {
        return flagName;
    }
    public void correctAnswer()
    {
        flag();
        answer = getFlagName();
    }
    public String getCorrectAnswer()
    {
        return answer;
    }
    public void getRandomAns()
    {
        
        boolean status = false;
        int count = 0;
        boolean duplicateStatus = false;
        String cAnswer = getCorrectAnswer();
        currentFlagArray[0] = cAnswer;
        System.out.println("The answer is: " + cAnswer);
        while(count < 3)
        {
            int randNum = numGenerator.nextInt(flags.size());
            String currentFlag = flagNames[randNum];
            System.out.println(currentFlag);
            for(int i= 1; i < currentFlagArray.length; i++)
            {
                int index = i-1;
                if (currentFlagArray[index].equalsIgnoreCase(currentFlag))
                {
                    duplicateStatus = true;
                    
                }
                if (!status)
                {
                     currentFlagArray[count+1] = currentFlag;
                   
                }
            }
           count += 1;
        }
        System.out.println("_______________________");
        for (String f : currentFlagArray)
        {
            System.out.println(f);
        }
    }
    
    public String getCurrentFlagArray(int index)
    {
        String flagLine = currentFlagArray[index];
        return flagLine;
    }
}
            
        
        
               
        
        
    
    
