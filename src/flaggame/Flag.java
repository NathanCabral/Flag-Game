/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flaggame;

/**
 *
 * @author Nathan Cabral
 */
public class Flag 
{
    String fcountryName;
    String flagFilePath;
    
    
    public Flag(String countryName, String fFlagFilePath)
    {
        fcountryName = countryName ;
        flagFilePath = fFlagFilePath ;
    }
    
    public String getFlagInfo()
    {
        String flagInfo = fcountryName+" "+ flagFilePath;
        return flagInfo;
    }
    
    public String getFlagFile()
    {
        return flagFilePath;
    }
    
    public String getCountry()
    {
        return fcountryName;
    }
    
    
}
